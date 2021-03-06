

public class Item implements Comparable<Item>
	{
		private int partNumber;
		private String description;
		
		public Item(int partNumber, String description)
		{
			this.setPartNumber(partNumber);
			this.setDescription(description);
		}
		
		public int compareTo(Item other)
		{
			return Integer.compare(this.partNumber, other.partNumber);
		}
		
		public String toString()
		{
			return "num is " + partNumber + " desc is " + description;
		}

		/**
		 * @return the partNumber
		 */
		public int getPartNumber() {
			return partNumber;
		}

		/**
		 * @param partNumber the partNumber to set
		 */
		public void setPartNumber(int partNumber) {
			this.partNumber = partNumber;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		
		
	}
