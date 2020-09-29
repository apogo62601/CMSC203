public class Lab4 {

	private String MANUFACTURER;
	private int SCREEN_SIZE;
	
	private int channel = 2;
	private int volume = 20;
	private boolean powerOn = false;
	public Lab4(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	public void setChannel(int station)
	{
		if(powerOn == true)
		{
			channel = station;
		}
		else
		{
			System.out.println("TV not on!");
		}
	}
	public void power()
	{
		powerOn = !(powerOn);
	}
	public void increaseVolume()
	{
		volume += 1;
	}
	public void decreaseVolume()
	{
		volume -= 1;
	}
	
	public int getChannel()
	{
		return channel;
	}
	public int getVolume()
	{
		return volume;
	}
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
}
