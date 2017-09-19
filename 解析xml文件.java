package class_xml;


import java.io.FileInputStream;
import java.io.FileNotFoundException;



import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Readxml {
	public static void main(String [] args) {
			Book book=DomReader("Library.xml");//d读取Library.xml文档
			System.out.println(book);
	}
	/**s
	 * 解析xml的方法；
	 * @param fileName
	 * @return  Book类的对象
	 */

	private static Book DomReader(String fileName) {
		SAXReader reader=new SAXReader();
		try {
			Document doc=reader.read(new FileInputStream(fileName));
			//获得跟标签；
			Element root=doc.getRootElement();
			//获得跟标签中的Book元素；
			Element ElBook=root.element("Book");
			//获得Book中的id属性
			//attributeValue获得标签对应的属性
			int id=Integer.parseInt(ElBook.attributeValue("id"));
			//获得Book中子元素的信息；
			//elemenText是获得标签中的值
			String title=ElBook.elementText("Title");
			String author=ElBook.elementText("Author");
			double price=Double.parseDouble(ElBook.elementText("Price"));
			String publisher=ElBook.elementText("Publisher");
			double cost=Double.parseDouble(ElBook.elementText("Cost"));
			//获得Member标签
			Element Member=root.element("Member");
			//获得Member中的name元素；
			Element name=Member.element("Name");
			String firstname=name.elementText("FirstName");
			String middlename=name.elementText("MiddleName");
			String lastname=name.elementText("LastName");
			String na=firstname+middlename+lastname;
			//获得Memeber中的address元素；
			Element member=root.element("Member");
			//获得address标签；
			Element address=member.element("Address");
			//获得address下的子元素；
			String housenumber=address.elementText("HouseNumber");
			String street=address.elementText("Street");
			String city=address.elementText("City");
			String ad=housenumber+street+city;
			return  new Book(id,title,author,price,publisher,cost,na,ad);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("文件寻找异常");
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException("文档读取异常");
		}
	}

	
}
