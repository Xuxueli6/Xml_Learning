package com.zp;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class GenerateXmlByJava {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.newDocument();
			Element team = doc.createElement("Team");
			Element teamMember = doc.createElement("TeamMember");

			Element empno = doc.createElement("Empno");
			Attr empnoValue = doc.createAttribute("value");
			empno.setAttribute(empnoValue.getNodeName(), "30772");

			Element name = doc.createElement("Name");
			Attr nameValue = doc.createAttribute("value");
			name.setAttribute(nameValue.getNodeName(), "Manjeet Singh");

			Element designation = doc.createElement("Designation");
			Attr designationValue = doc.createAttribute("value");
			designation.setAttribute(designationValue.getNodeName(), "Team Leader.");

			team.appendChild(teamMember);
			teamMember.appendChild(empno);
			teamMember.appendChild(name);
			teamMember.appendChild(designation);
			doc.appendChild(team);

			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new java.io.File("newXml.xml"));
			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
