package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo2 {

	public static void main(String[] args)
	{
	List<String> compMaterial=new ArrayList<String>();
	compMaterial.add("laptop");
	compMaterial.add("keyboard");
	compMaterial.add("Ram");
	compMaterial.add("Lancable");
	List<String> electronics=new ArrayList<String>();
	electronics.add("Doide");
	electronics.add("Capacitor");
	electronics.add("triod");
	List<String> Furniture=new ArrayList<String>();
	Furniture.add("Table");
	Furniture.add("Sofa");
	Furniture.add("Tipoy");
	
	HashMap<String, List<String>> catogories=new HashMap<String, List<String>>();
	catogories.put("CompMaterialShop", compMaterial);
	catogories.put("CompMaterialShop", electronics);
	catogories.put("Furniture", Furniture);
	HashMap<String , HashMap<String , List<String>>> eshop=new HashMap<String , HashMap<String , List<String>>>();
	eshop.put("E-Shop", catogories);
	System.out.println(eshop);
	java.util.Set<String> s=eshop.keySet();
	for(String str: s)
	{
		System.out.println(s+" "+eshop.get(str) );
	}
	
	}
}
