package org.agaroth.client;

public final class Item extends Animable {

	public int amount;
	public int id;

	@Override
	public final Model getRotatedModel() {
		ItemDefinition definition = ItemDefinition.get(id);
		return definition.getInventoryModel(amount);
	}

}