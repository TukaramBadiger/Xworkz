package Homework;


	public class model1 {
		 String text;
		String model = "splendor";
		String price = "1 lakh";
		String company = "Hero";
		public String bike(int j) {
		
			for (int i = j; i <= 2; i++) {

				try {
					if (model == "splendor") {
						text = model;
						model = "qweqw";
						return text;
					}
				} catch (Exception e) {
					System.out.println("1. ");
				}
				try {
					if (price == "1 lakh") {
						text = price;
						price = "qw";

						this.text = text;
						return text;

					}
				} catch (Exception e) {
					System.out.println("null");
				}
				try {
					if (company == "Hero") {
						text = company;
						company = "qww";

						this.text = text;
						return text;
					}

				} catch (Exception e) {
					System.out.println("null");
				}

			}
			return null;

		}

		public static void main(String[] args) {
			model1 s = new model1();
			for (int i = 0; i <= 2; i++) {
				System.out.println(s.bike(i));
			}
		}
	}
