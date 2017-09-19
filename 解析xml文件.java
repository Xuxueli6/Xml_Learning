package class_xml;


import java.io.FileInputStream;
import java.io.FileNotFoundException;



import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Readxml {
	public static void main(String [] args) {
			Book book=DomReader("Library.xml");//d��ȡLibrary.xml�ĵ�
			System.out.println(book);
	}
	/**s
	 * ����xml�ķ�����
	 * @param fileName
	 * @return  Book��Ķ���
	 */

	private static Book DomReader(String fileName) {
		SAXReader reader=new SAXReader();
		try {
			Document doc=reader.read(new FileInputStream(fileName));
			//��ø���ǩ��
			Element root=doc.getRootElement();
			//��ø���ǩ�е�BookԪ�أ�
			Element ElBook=root.element("Book");
			//���Book�е�id����
			//attributeValue��ñ�ǩ��Ӧ������
			int id=Integer.parseInt(ElBook.attributeValue("id"));
			//���Book����Ԫ�ص���Ϣ��
			//elemenText�ǻ�ñ�ǩ�е�ֵ
			String title=ElBook.elementText("Title");
			String author=ElBook.elementText("Author");
			double price=Double.parseDouble(ElBook.elementText("Price"));
			String publisher=ElBook.elementText("Publisher");
			double cost=Double.parseDouble(ElBook.elementText("Cost"));
			//���Member��ǩ
			Element Member=root.element("Member");
			//���Member�е�nameԪ�أ�
			Element name=Member.element("Name");
			String firstname=name.elementText("FirstName");
			String middlename=name.elementText("MiddleName");
			String lastname=name.elementText("LastName");
			String na=firstname+middlename+lastname;
			//���Memeber�е�addressԪ�أ�
			Element member=root.element("Member");
			//���address��ǩ��
			Element address=member.element("Address");
			//���address�µ���Ԫ�أ�
			String housenumber=address.elementText("HouseNumber");
			String street=address.elementText("Street");
			String city=address.elementText("City");
			String ad=housenumber+street+city;
			return  new Book(id,title,author,price,publisher,cost,na,ad);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("�ļ�Ѱ���쳣");
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException("�ĵ���ȡ�쳣");
		}
	}

	
}
