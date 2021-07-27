// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class23
{

    public static void method264(int i, Class44 class44)
    {
        Stream class30_sub2_sub2 = new Stream(class44.method571("spotanim.dat", null));
        anInt402 = class30_sub2_sub2.method410();
        if(aClass23Array403 == null)
            aClass23Array403 = new Class23[anInt402];
        for(int j = 0; j < anInt402; j++)
        {
            if(aClass23Array403[j] == null)
                aClass23Array403[j] = new Class23();
            aClass23Array403[j].anInt404 = j;
            aClass23Array403[j].method265(class30_sub2_sub2);
		}
    }
private void method265(Stream class30_sub2_sub2) {
		do {
			int i = class30_sub2_sub2.method408();
			if (i == 0)
				return;
			if (i == 1)
				anInt405 = class30_sub2_sub2.method410();
			else if (i == 2) {
				anInt406 = class30_sub2_sub2.method410();
				if (Class20.aClass20Array351 != null)
					aClass20_407 = Class20.aClass20Array351[anInt406];
			} else if (i == 4)
				anInt410 = class30_sub2_sub2.method410();
			else if (i == 5)
				anInt411 = class30_sub2_sub2.method410();
			else if (i == 6)
				anInt412 = class30_sub2_sub2.method410();
			else if (i == 7)
				anInt413 = class30_sub2_sub2.method408();
			else if (i == 8)
				anInt414 = class30_sub2_sub2.method408();
			else if (i == 40) {
				int j = class30_sub2_sub2.method408();
				for (int k = 0; k < j; k++) {
					anIntArray408[k] = class30_sub2_sub2.method410();
					anIntArray409[k] = class30_sub2_sub2.method410();
				}
			} else
				System.out.println("Error unrecognised spotanim config code: "
						+ i);
		} while (true);
	}

    public Model method266()
    {
        Model Model = (Model)aClass12_415.method222(anInt404);
        if(Model != null)
            return Model;
        Model = Model.method462(anInt400, anInt405);
        if(Model == null)
            return null;
        for(int i = 0; i < 6; i++)
            if(anIntArray408[0] != 0)
                Model.method476(anIntArray408[i], anIntArray409[i]);

        aClass12_415.method223(Model, anInt404, (byte)2);
        return Model;
    }

    public Class23()
    {
        anInt400 = 9;
        anInt406 = -1;
        anIntArray408 = new int[11];
        anIntArray409 = new int[11];
        anInt410 = 128;
        anInt411 = 128;
    }

    private int anInt400;
    private static boolean aBoolean401 = true;
    public static int anInt402;
    public static Class23 aClass23Array403[];
    public int anInt404;
    public int anInt405;
    public int anInt406;
    public Class20 aClass20_407;
    public int anIntArray408[];
    public int anIntArray409[];
    public int anInt410;
    public int anInt411;
    public int anInt412;
    public int anInt413;
    public int anInt414;
    public static MRUNodes aClass12_415 = new MRUNodes(false, 30);

}