package class_xml;

public class Book {
		private int id;//BookID属性
		private String title;//书的标题
		private String author;//作者
		private double price;//价格
		private String publisher;//出版商
		private double cost;//总消费
		private String name;
		private String address;
		//构造方法
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
