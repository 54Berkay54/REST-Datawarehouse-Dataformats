package tradearea.warehouse;

import tradearea.model.ProductData;
import tradearea.model.WarehouseData;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class WarehouseSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}

    public WarehouseData getData( String inID ) {
        WarehouseData wd = new WarehouseData();
        WarehouseData wd2 = new WarehouseData();
        WarehouseData wd3 = new WarehouseData();

        wd.setWarehouseID("001");
        wd2.setWarehouseID("002");
        wd3.setWarehouseID("003");

        wd.setWarehouseName("Lagerhaus Wien");
        wd2.setWarehouseName("Lagerhaus Salzburg");
        wd3.setWarehouseName("Lagerhaus Graz");

        wd.setWarehouseAddress("Effingergasse 18");
        wd2.setWarehouseAddress("Fanny-von-Lehnert-Straße 5");
        wd3.setWarehouseAddress("Anzengrubergasse 1");

        wd.setWarehousePostalCode("1170");
        wd2.setWarehousePostalCode("5020");
        wd3.setWarehousePostalCode("8010");

        wd.setWarehouseCity("Wien");
        wd2.setWarehouseCity("Salzburg");
        wd3.setWarehouseCity("Graz");

        wd.setWarehouseCountry("Österreich");
        wd2.setWarehouseCountry("Österreich");
        wd3.setWarehouseCountry("Österreich");

        List<ProductData> products = new ArrayList<>();

        ProductData wp = new ProductData("P001", "Laptop", "Electronics", getRandomInt(10, 100), "pcs");
        ProductData wp2 = new ProductData("P002", "Smartphone", "Electronics", getRandomInt(20, 200), "pcs");
        ProductData wp3 = new ProductData("P003", "Tablet", "Electronics", getRandomInt(15, 150), "pcs");
        ProductData wp4 = new ProductData("P004", "Headphones", "Accessories", getRandomInt(30, 300), "pcs");
        ProductData wp5 = new ProductData("P005", "Smartwatch", "Wearables", getRandomInt(5, 50), "pcs");
        ProductData wp6 = new ProductData("P006", "Camera", "Photography", getRandomInt(8, 80), "pcs");
        ProductData wp7 = new ProductData("P007", "Printer", "Office Supplies", getRandomInt(12, 120), "pcs");
        ProductData wp8 = new ProductData("P008", "Monitor", "Electronics", getRandomInt(7, 70), "pcs");
        ProductData wp9 = new ProductData("P009", "Keyboard", "Accessories", getRandomInt(25, 250), "pcs");
        ProductData wp10 = new ProductData("P010", "Mouse", "Accessories", getRandomInt(30, 300), "pcs");

        products.add(wp);
        products.add(wp2);
        products.add(wp3);
        products.add(wp4);
        products.add(wp5);
        products.add(wp6);
        products.add(wp7);
        products.add(wp8);
        products.add(wp9);
        products.add(wp10);

        Collections.shuffle(products);
        for(int i=0; i<5; i++) {
            products.remove(i);
        }
        products.sort((a, b) -> a.getProductId().compareTo(b.getProductId()));
        System.out.println(wd.getTimestamp());
        switch (inID) {
            case "001":
                wd.addProduct(products);
                return wd;
            case "002":
                wd2.addProduct(products);
                return wd2;
            case "003":
                wd3.addProduct(products);
                return wd3;
            default:
                break;
        }
        return null;
    }

}
