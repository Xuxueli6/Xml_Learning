package class_xml;

public class Book {
		private int id;//BookID����
		private String title;//��ı���
		private String author;//����
		private double price;//�۸�
		private String publisher;//������
		private double cost;//������
		private String name;
		private String address;
		//���췽��
		public Book(int id,String title,String author,double price,String publisher,double cost,String name,String address) {
			super();
			this.id=id;
			this.title=title;
			this.author=author;
			this.price=price;
			this.publisher=publisher;
			this.cost=cost;
			this.name=name;
			this.address=address;
		}
		
		public void setId(int id) {
			this.id=id;
		}
		public int getId() {
			return this.id;
		}
		public void setTitle(String title) {
			this.title=title;
		}
		public String getTitle() {
			return title;
		}
		public void setAuthor(String author) {
			this.author=author;
		}
		public String getAuthor() {
			return author;
		}
		public void setPrice(double price) {
			this.price=price;
		}
		public double getPrice() {
			return price;
		}
		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public void setCost(double cost) {
			this.cost=cost;
		}
		public double getCost() {
			return cost;
		}		

		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", publisher="
					+ publisher + ", cost=" + cost + ", name=" + name + ", address=" + address + "]";
		}
}
