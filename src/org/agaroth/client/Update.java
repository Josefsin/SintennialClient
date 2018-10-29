package org.agaroth.client;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * The custom update server to download and update the cache.
 * @author Apache Ah64
 */
public class Update {
	
	/**
	 * The client reference.
	 */
	private Client c;
	
	/**
	 * The cache directory.
	 */
	private static final String CACHE_DIR = Signlink.getCacheDirectory();
	
	/**
	 * Construct a new {@code Updater} {@code Object}.
	 * @param c The client reference.
	 */
	public Update(Client c) {
		this.c = c;
	}
	
	/**
	 * Update the cache.
	 */
	public void updateCache() {
		File file = new File(CACHE_DIR+"version_2.dat");
		if(!file.exists()) {
			downloadArchive("https://dl.dropboxusercontent.com/s/o8ey3wav8jvlhie/SintennialCacheV2.zip");
		}
		file = new File(CACHE_DIR+"SintennialCacheV2.zip");
		if(file.exists()) {
			unzip(CACHE_DIR+"SintennialCacheV2.zip");
		}
	}
	
	/**
	 * Download the cache archive from the web server.
	 * @param dlurl The uniform resource locater to the file that has to be downloaded.
	 * @param cachePart The part of the cache that is being downloaded.
	 */
	private void downloadArchive(String dlurl) {
		try {
			URLConnection url = new URL(dlurl).openConnection();
		    int i = url.getContentLength();
		    InputStream is = url.getInputStream();
			OutputStream os = new FileOutputStream(CACHE_DIR+"/SintennialCacheV2.zip");
			byte[] b = new byte[4096];
			int length;
			int old = 0;
			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
				old += length;
				int percent = (int) ((double) old / (double) i * 100.0);
				c.setLoadingPercentage(percent);
			}
			is.close();
			os.close();
			File file = new File(CACHE_DIR+"version_2.dat");
			if(!file.exists()) {
				file.createNewFile();
			}
			unzip(CACHE_DIR+"SintennialCacheV2.zip");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Unzip the cache archive part.
	 * @param file The file location.
	 */
	private void unzip(String file) {
		Enumeration<?> entries;
		ZipFile zipFile;
		try {
			zipFile = new ZipFile(file);
			entries = zipFile.entries();
			while(entries.hasMoreElements()) {
				ZipEntry entry = (ZipEntry)entries.nextElement();
				if(entry.isDirectory()) {
					(new File(CACHE_DIR+"/"+entry.getName())).mkdir();
					continue;
				}
				copyInputStream(zipFile.getInputStream(entry),
				new BufferedOutputStream(new FileOutputStream(CACHE_DIR+"/"+entry.getName())));
			}
			zipFile.close();
			File zip = new File(file);
			zip.delete();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		}
	}
	
	/**
	 * Make a copy of the input stream and write it.
	 * @param in The input.
	 * @param out The output.
	 * @throws IOException
	 */
	private static final void copyInputStream(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		int len;
		while((len = in.read(buffer)) >= 0) {
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}
}