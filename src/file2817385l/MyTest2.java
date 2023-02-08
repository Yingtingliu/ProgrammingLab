package file2817385l;

public class MyTest2 {

	public static void main(String[] args) {
		File setting = new File("Setting",10);
		File ringtone = new File("ringtone",120);
		File ringtone2 = new File("ringtone",55);
		File familyHoliday = new File("family-holiday",201);
		File portrait = new File("portrait",134);
		File wallpaper = new File("wallpaper",421);

		Directory misc = new Directory("misc");
		misc.add(wallpaper);		

		Directory personal = new Directory("personal");
		personal.add(familyHoliday);
		personal.add(portrait);
		Directory pictures = new Directory("pictures");
		pictures.add(personal);
		pictures.add(misc);
		Directory music = new Directory("music");
		music.add(ringtone);
		Directory root = new Directory("root");
		root.add(setting);
		root.add(music);
		root.add(pictures);
		root.add(ringtone2);
		
		pictures.remove(personal);
		
		System.out.println(root.display("\t"));

		System.out.println( root.search("ringtone").getName() );

	}

}
