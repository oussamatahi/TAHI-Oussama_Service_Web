package fr.insa.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import fr.insa.service.Product;
import fr.insa.service.ProductService;
import fr.insa.service.ProductServiceService;

public class ProductSearch {
	
	public List<Product> getResult(String productName,String category) throws RemoteException {
		

		ProductServiceService productServiceSvc = new ProductServiceService();
		ProductService productService = productServiceSvc.getProductServicePort();
		System.out.println("List des productSearch");
		List<Product> products = productService.searchProductsByCriteria(productName, category);
		return products;
	}

	public static void main(String[] args) throws RemoteException {

		ProductSearch productsearch = new ProductSearch();
		System.out.println(productsearch.getResult("Bannana","Fruits"));

	}

}
