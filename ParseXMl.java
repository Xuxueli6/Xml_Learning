package com.zp;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class ParseXMl {
	Element root = null;

	public ParseXMl() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("xml.xml");
			doc.normalize();
			root = doc.getDocumentElement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

public	void parse() {
		System.out.println("<?xml version = \"1.0\"?>");
		System.out.println("<" + root.getNodeName() + ">");
		NodeList children = root.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
			if (child.getNodeType() == Node.ELEMENT_NODE) {
				System.out.print("<" + child.getNodeName() + ">");
				System.out.print(child.getFirstChild().getNodeValue());
				System.out.println("</" + child.getNodeName() + ">");
			}
		}
		System.out.println("</" + root.getNodeName() + ">");
	}

	public static void main(String[] args) {
		ParseXMl parseSimpleXml = new ParseXMl();
		parseSimpleXml.parse();
	}
}
