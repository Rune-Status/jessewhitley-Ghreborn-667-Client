public class Class22
{

    public static void method260(int i, Class44 class44)
    {
        if(i != 0)
            anInt386 = 115;
        Stream class30_sub2_sub2 = new Stream(class44.method571("flo.dat", null));
        anInt387 = class30_sub2_sub2.method410();
        if(aClass22Array388 == null)
            aClass22Array388 = new Class22[anInt387];
        for(int j = 0; j < anInt387; j++)
        {
            if(aClass22Array388[j] == null)
                aClass22Array388[j] = new Class22();
            aClass22Array388[j].method261(class30_sub2_sub2);
            System.out.println(""+j);
            System.out.println(""+aClass22Array388[j].anInt390);
            System.out.println(""+aClass22Array388[j].anInt394);
        }
	//System.out.println("667 Overlay Loaded: " + anInt387);
    }

	private void method261(Stream class30_sub2_sub2) {
		do {
			int opcode = class30_sub2_sub2.method408();
			switch(opcode) {
				case 1:
					anInt390 = class30_sub2_sub2.method412();
					method262(anInt390, true);
					break;
				case 2:
					anInt391 = class30_sub2_sub2.method408();
					break;
				case 3:
					break;
				case 5:
					aBoolean393 = false;
					break;
				case 6:
					 class30_sub2_sub2.method415();
					break;
				case 7:
					int j = anInt394;
					int k = anInt395;
					int l = anInt396;
					int i1 = anInt397;
					int j1 = class30_sub2_sub2.method412();
					anInt399 = j1;
					method262(j1, true);
					anInt394 = j;
					anInt395 = k;
					anInt396 = l;
					anInt397 = i1;
					anInt398 = i1;
					break;
                case 0:
                    return;
				default:
					System.out.println("Error unrecognised config code: " + opcode);
					break;
			}
		} while(true);
	}

	private void method262(int color, boolean flag) {
		double d = (double)(color >> 16 & 0xff) / 256D;
		double d1 = (double)(color >> 8 & 0xff) / 256D;
		double d2 = (double)(color & 0xff) / 256D;
		double d3 = d;
		if(d1 < d3)
			d3 = d1;
		if(d2 < d3)
			d3 = d2;
		double d4 = d;
		if(d1 > d4)
			d4 = d1;
		if(d2 > d4)
			d4 = d2;
		double d5 = 0.0D;
		double d6 = 0.0D;
		double d7 = (d3 + d4) / 2D;
		if(d3 != d4)
		{
			if(d7 < 0.5D)
				d6 = (d4 - d3) / (d4 + d3);
			if(d7 >= 0.5D)
				d6 = (d4 - d3) / (2D - d4 - d3);
			if(d == d4)
				d5 = (d1 - d2) / (d4 - d3);
			else
			if(d1 == d4)
				d5 = 2D + (d2 - d) / (d4 - d3);
			else
			if(d2 == d4)
				d5 = 4D + (d - d1) / (d4 - d3);
		}
		d5 /= 6D;
		anInt394 = (int)(d5 * 256D);
		anInt395 = (int)(d6 * 256D);
		anInt396 = (int)(d7 * 256D);
		if(anInt395 < 0)
			anInt395 = 0;
		else
		if(anInt395 > 255)
			anInt395 = 255;
		if(anInt396 < 0)
			anInt396 = 0;
		else
		if(anInt396 > 255)
			anInt396 = 255;
		if(d7 > 0.5D)
			anInt398 = (int)((1.0D - d7) * d6 * 512D);
		else
			anInt398 = (int)(d7 * d6 * 512D);
		if(anInt398 < 1)
			anInt398 = 1;
		anInt397 = (int)(d5 * (double)anInt398);
		int hOffset = anInt394;
		int sOffset = anInt395;
		int lOffset = anInt396;
		anInt399 = method263(hOffset, sOffset, lOffset);
	}


    private final int method263(int i, int j, int k)
    {
        if(k > 179)
            j /= 2;
        if(k > 192)
            j /= 2;
        if(k > 217)
            j /= 2;
        if(k > 243)
            j /= 2;
        int l = (i / 4 << 10) + (j / 32 << 7) + k / 2;
        return l;
    }

    public Class22()
    {
        aBoolean385 = true;
        anInt391 = -1;
        aBoolean392 = false;
        aBoolean393 = true;
    }

    private boolean aBoolean385;
    private static int anInt386;
    public static int anInt387;
    public static Class22 aClass22Array388[];
    public String aString389;
    public int anInt390;
    public int anInt391;
    public boolean aBoolean392;
    public boolean aBoolean393;
    public int anInt394;
    public int anInt395;
    public int anInt396;
    public int anInt397;
    public int anInt398;
    public int anInt399;
}
