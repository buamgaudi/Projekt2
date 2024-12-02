package inginf;

import java.util.ArrayList;

public class SampleStore {

    private ArrayList<Item> items = new ArrayList<Item>();
    public ArrayList<Item> getItems() {
        return items;
    }

    public SampleStore() {   

        Item itemAuto = new Item("Auto", 
            "Auto als komplette Baugruppe",
            "zusammengebaut");

        Item itemAchse = new Item("Achse", 
            "Achse als komplette Baugruppe",
            "zusammengebaut");

        Item itemRad = new Item("Rad", 
            "Rad als Einzelteil", 
            "PVC");
        itemRad.setWeightedWeight(10);
        
        Item itemHaube = new Item("Haube",
         "Oberteil als Einzelteil", "PVC");
        itemHaube.setCalculatedWeight(20);

        Item itemSteckAchse = new Item("Steckachse", 
            "Steckachse als Einzelteil", 
            "Stahl");
        itemSteckAchse.setEstimatedWeight(5);

        Item itemMotor = new Item("Motor", 
            "Motor als Baugruppe", 
            "Metall");
        itemMotor.setCalculatedWeight(150);

        Item itemKolben = new Item("Kolben", 
            "Kolben als Einzelteil", 
            "Aluminium");
        itemKolben.setWeightedWeight(30);

        itemMotor.getUses().add(
            new ItemInstance("Kolben", itemKolben));

        itemAuto.getUses().add(
            new ItemInstance(
                "Vorderachse", 
                itemAchse));
        itemAuto.getUses().add(
            new ItemInstance(
                "Motor", 
                itemMotor));
        itemAuto.getUses().add(
            new ItemInstance(
                "Hinterachse", 
                itemAchse));
        itemAuto.getUses().add(
            new ItemInstance(
                "Aufbau", 
                itemHaube));
        itemAuto.getUses().add(
            new ItemInstance(
                "Reserverad", itemRad));

        itemAchse.getUses().add(
            new ItemInstance("Rad links", itemRad));
        itemAchse.getUses().add(
            new ItemInstance("Rad rechts", itemRad));
        itemAchse.getUses().add(
            new ItemInstance("Steckachse", itemSteckAchse));

        items.add(itemAuto);
        items.add(itemAchse);
        items.add(itemRad);
        items.add(itemHaube);
        items.add(itemSteckAchse);
        items.add(itemMotor);
        items.add(itemKolben);

        for (Item item : items) {
            item.Id = items.indexOf(item);
        }
    }
}