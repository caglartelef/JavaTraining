package com.javatraining.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat catObj=new Cat();
		catObj.setName("catOne");
		catObj.eat("milk");
		catObj.writer();
		
		Dog dogObj=new Dog();
		dogObj.setName("dogOne");
		dogObj.eat("meat");
		dogObj.writer();
		
		
		List list = new ArrayList<String>();
		list.add("aasd");
		list.add("fff");
		list.add("ccc");

		ListIterator<String> listItr = list.listIterator();

		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("---------");
		System.out.println(list.get(1));

		Vector vector = new Vector();
		vector.add(1);
		vector.add(6);
		vector.add(5);

		ListIterator itrVector = vector.listIterator();

		while (itrVector.hasNext()) {
			System.out.println(itrVector.next());
		}

		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("d");
		linkList.add("d");
		linkList.add("d");
		System.currentTimeMillis();

		HashSet set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("a");

		Iterator setItr = set.iterator();

		while (setItr.hasNext()) {
			System.out.println(setItr.next());
		}

		Cat obj = new Cat();
		Cat obj1 = new Cat();
		Cat obj2 = new Cat();
		HashMap<String, Cat> hashMap = new HashMap<>();
		hashMap.put("a", obj);
		hashMap.put("b", obj1);
		hashMap.put("c", obj2);
		Iterator itrMap = hashMap.entrySet().iterator();
		Map.Entry data = null;
		Cat objCat=null;
		try {
			while (itrMap.hasNext()) {
				data = (Map.Entry) itrMap.next();
				if (data != null) {
					objCat= (Cat) data.getValue();
					System.out.println(objCat.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "a");
		treeMap.put(5, "b");
		treeMap.put(3, "c");
		treeMap.put(4, "d");

		Set setTree = treeMap.entrySet();
		Iterator itrSetTree = setTree.iterator();
		while (itrSetTree.hasNext()) {
			System.out.println(itrSetTree.next());

		}
		
		
	}
}
