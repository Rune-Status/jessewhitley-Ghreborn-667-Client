import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

final class Class5
{

    public static final Class5 method159(int i)
    {
        for(int j = 0; j < 20; j++)
            if(aClass5Array80[j].aLong78 == (long)i)
                return aClass5Array80[j];

        anInt56 = (anInt56 + 1) % 20;
        Class5 class5 = aClass5Array80[anInt56] = new Class5();
        aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[i];
        class5.aLong78 = i;
        class5.method165(true, aClass30_Sub2_Sub2_60);

if (class5.aLong78 == i &&  class5.anIntArray76 == null) {
			 class5.anIntArray76 = new int [1];
			class5.anIntArray70 = new int [1];
			 class5.anIntArray76[0] = 0;
			class5.anIntArray70[0] = 1;
		}

if (class5.anIntArray76 != null) {
			for (int i2 = 0; i2 < class5.anIntArray76.length; i2++) {
				if (class5.anIntArray70[i2] == 0) {
					class5.anIntArray70[i2] = 1;
				}
			}
		}
if(i == 6248) {
    class5.anIntArray94[0] = 75266;
}
return class5;
    }
    public final Model method160(boolean flag)
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161();
            if(class5 == null)
                return null;
            else
                return class5.method160(true);
        }
        if(anIntArray73 == null)
            return null;
        boolean flag1 = false;
        if(!flag)
            anInt64 = 303;
        for(int i = 0; i < anIntArray73.length; i++)
            if(!Model.method463(anIntArray73[i]))
                flag1 = true;

        if(flag1)
            return null;
        Model aModel[] = new Model[anIntArray73.length];
        for(int j = 0; j < anIntArray73.length; j++)
            aModel[j] = Model.method462(anInt69, anIntArray73[j]);

        Model Model;
        if(aModel.length == 1)
            Model = aModel[0];
        else
            Model = new Model(aModel.length, aModel, -38);
        if(anIntArray76 != null)
        {
            for(int k = 0; k < anIntArray76.length; k++)
                Model.method476(anIntArray76[k], anIntArray70[k]);

        }
        return Model;
    }
	   public static void dumpNpc() {
		      for(int i = 0; i < 9000; ++i) {
		         Class5 EntityDef = method159(i);
		         BufferedWriter bw = null;

		         try {
		            bw = new BufferedWriter(new FileWriter("./NpcList.txt", true));
		            if(EntityDef.aString65 != null) {
		               bw.write("////////////////////////////////////////////");
		               bw.newLine();
		               bw.newLine();
		               bw.newLine();
		               bw.write("if(i == " + i + ") {//Npc ID");
		               bw.newLine();
		               bw.write("class5.name = \"" + EntityDef.aString65 + "\";//Npc Name");
		               bw.newLine();
		               bw.write("class5.combatLevel = " + EntityDef.anInt61 + ";//Npc Combat");
		               bw.newLine();
		               bw.write("class5.standAnim = " + EntityDef.anInt77 + ";//Stand Animation  (Default = 808)");
		               bw.newLine();
		               bw.write("class5.walkAnim = " + EntityDef.anInt67 + ";//Walk Forward Animation (Default = 819");
		               bw.newLine();
		               bw.write("class5.anInt58 = " + EntityDef.anInt58 + ";//Walk Backwards Animation (Retreat) (Default = 820)");
		               bw.newLine();
		               bw.write("class5.anInt55 = " + EntityDef.anInt55 + ";//Walk Right (Default = 822)");
		               bw.newLine();
		               bw.write("class5.anInt83 = " + EntityDef.anInt83 + ";//Walk Left (Default = 821)");
		               bw.newLine();
		               bw.write("class5.spaceOccupied = " + EntityDef.aByte68 + ";//Npc size");
		               bw.newLine();
		               int i2;
		               if(EntityDef.anIntArray94 != null) {
		                  for(i2 = 0; i2 < EntityDef.anIntArray94.length; ++i2) {
		                     if(i2 == 0) {
		                        bw.write("class5.npcModels[0] = ");
		                     }

		                     if(i2 != EntityDef.anIntArray94.length - 1) {
		                        bw.write(EntityDef.anIntArray94[i2] + "; ");
		                     } else {
		                        bw.write(EntityDef.anIntArray94[i2] + ";//Npc Model/Models. ");
		                        bw.newLine();
		                     }
		                  }
		               }

		               if(EntityDef.anIntArray76 != null) {
		                  for(i2 = 0; i2 < EntityDef.anIntArray76.length; ++i2) {
		                     if(i2 == 0) {
		                        bw.write("class5.originalModelColors[0] = ");
		                     }

		                     if(i2 != EntityDef.anIntArray76.length - 1) {
		                        bw.write(EntityDef.anIntArray76[i2] + "; ");
		                     } else {
		                        bw.write(EntityDef.anIntArray76[i2] + ";//Old Colours ");
		                        bw.newLine();
		                     }
		                  }
		               }

		               if(EntityDef.anIntArray70 != null) {
		                  for(i2 = 0; i2 < EntityDef.anIntArray70.length; ++i2) {
		                     if(i2 == 0) {
		                        bw.write("class5.changedModelColors[0] = ");
		                     }

		                     if(i2 != EntityDef.anIntArray70.length - 1) {
		                        bw.write(EntityDef.anIntArray70[i2] + "; ");
		                     } else {
		                        bw.write(EntityDef.anIntArray70[i2] + ";//New Colours ");
		                        bw.newLine();
		                     }
		                  }
		               }

		               bw.write("}");
		               bw.newLine();
		               bw.flush();
		               bw.close();
		            }
		         } catch (IOException var4) {
		            ;
		         }
		      }

		   }

    public final Class5 method161() {
	int j = -1;
        if(anInt57 != -1) {
        try{
            VarBit class37 = VarBit.aClass37Array646[anInt57];
            int k = class37.anInt648;
            int l = class37.anInt649;
            int i1 = class37.anInt650;
            int j1 = client.anIntArray1232[i1 - l];
            j = aClient82.variousSettings[k] >> l & j1;
			} catch (Exception failed) {}
        } else
        if(anInt59 != -1)
            j = aClient82.variousSettings[anInt59];
        if(j < 0 || j >= anIntArray88.length || anIntArray88[j] == -1)
            return null;
        else
            return method159(anIntArray88[j]);
    }

    public static final void method162(Class44 class44)
    {
        aClass30_Sub2_Sub2_60 = new Stream(class44.method571("npc.dat", null));
        Stream class30_sub2_sub2 = new Stream(class44.method571("npc.idx", null));
        anInt62 = class30_sub2_sub2.readUnsignedShort();
        anIntArray72 = new int[anInt62];
        int i = 2;
        for(int j = 0; j < anInt62; j++)
        {
            anIntArray72[j] = i;
            i += class30_sub2_sub2.readUnsignedShort();
        }

        aClass5Array80 = new Class5[20];
        for(int k = 0; k < 20; k++)
            aClass5Array80[k] = new Class5();
        dumpNpc();
    }

    public static final void method163(int i)
    {
        aClass12_95 = null;
        anIntArray72 = null;
        if(i >= 0)
            anInt74 = 60;
        aClass5Array80 = null;
        aClass30_Sub2_Sub2_60 = null;
    }

	public void configs(String name, int stand, int walk, int level, byte space, int modelAmount, int[] modelsIds, String examine) {
    		aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630]; 
    		method165(true, aClass30_Sub2_Sub2_60);
		aStringArray66 = new String[5];
    		aStringArray66[1] = "Attack";
		anIntArray94 = new int[modelAmount];
		for (int i = 0; i < modelAmount; i++)
			anIntArray94[i] = modelsIds[i];
    		anInt77 = stand;
    		anInt67 = walk;
    		anInt58 = walk;
    		anInt83 = walk;
    		anInt55 = walk;	
    		anInt61 = level;
		aByteArray89 = examine.getBytes();
		aByte68 = space;
    		aString65 = name;
		aStringArray66 = new String[5];
    		aStringArray66[1] = "Attack";
	}
    public final Model method164(int i, int j, int k, int ai[])
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161();
            if(class5 == null)
                return null;
            else
                return class5.method164(0, j, k, ai);
        }
        Model Model = (Model)aClass12_95.method222(aLong78);
        if(i != 0)
        {
            for(int l = 1; l > 0; l++);
        }
        if(Model == null)
        {
            boolean flag = false;
            for(int i1 = 0; i1 < anIntArray94.length; i1++)
                if(!Model.method463(anIntArray94[i1]))
                    flag = true;

            if(flag)
                return null;
            Model aModel[] = new Model[anIntArray94.length];
            for(int j1 = 0; j1 < anIntArray94.length; j1++)
                aModel[j1] = Model.method462(anInt69, anIntArray94[j1]);

            if(aModel.length == 1)
                Model = aModel[0];
            else
                Model = new Model(aModel.length, aModel, -38);
            if(anIntArray76 != null)
            {
                for(int k1 = 0; k1 < anIntArray76.length; k1++)
                    Model.method476(anIntArray76[k1], anIntArray70[k1]);

            }
            Model.method469((byte)-71);
            Model.method479(84 + anInt85, 1000 + anInt92, -90, -580, -90, true);
            aClass12_95.method223(Model, aLong78, (byte)2);
        }
        Model Model_1 = Model.aModel_1621;
        Model_1.method464(7, Model, Class36.method532(k, false) & Class36.method532(j, false));
        if(k != -1 && j != -1)
            Model_1.method471(-20491, ai, j, k);
        else
        if(k != -1)
            Model_1.method470(k, 40542);
        if(anInt91 != 128 || anInt86 != 128)
            Model_1.method478(anInt91, anInt91, anInt63, anInt86);
        Model_1.method466(false);
        Model_1.anIntArrayArray1658 = null;
        Model_1.anIntArrayArray1657 = null;
        if(aByte68 == 1)
            Model_1.aBoolean1659 = true;
        return Model_1;
    }

private void method165(boolean flag, Stream class30_sub2_sub2)
	{
		do
		{
			int i = class30_sub2_sub2.method408();
			if(i == 0)
				return;
			if(i == 1)
			{
				int j = class30_sub2_sub2.method408();
				anIntArray94 = new int[j];
				for(int j1 = 0; j1 < j; j1++)
					anIntArray94[j1] = class30_sub2_sub2.readUnsignedShort();

			} else
			if(i == 2)
				aString65 = class30_sub2_sub2.method415();
			else
			if(i == 3)
				aByteArray89 = class30_sub2_sub2.method416((byte)30);
			else
			if(i == 12)
				aByte68 = class30_sub2_sub2.method409();
			else
			if(i == 13)
				anInt77 = class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 14)
				anInt67 = class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 17)
			{
				anInt67 = class30_sub2_sub2.readUnsignedShort();
				anInt58 = class30_sub2_sub2.readUnsignedShort();
				anInt83 = class30_sub2_sub2.readUnsignedShort();
				anInt55 = class30_sub2_sub2.readUnsignedShort();
			} else
			if(i >= 30 && i < 40)
			{
				if(aStringArray66 == null)
					aStringArray66 = new String[5];
				aStringArray66[i - 30] = class30_sub2_sub2.method415();
				if(aStringArray66[i - 30].equalsIgnoreCase("hidden"))
					aStringArray66[i - 30] = null;
			} else
			if(i == 40)
			{
				int k = class30_sub2_sub2.method408();
				anIntArray76 = new int[k];
				anIntArray70 = new int[k];
				for(int k1 = 0; k1 < k; k1++)
				{
					anIntArray76[k1] = class30_sub2_sub2.readUnsignedShort();
					anIntArray70[k1] = class30_sub2_sub2.readUnsignedShort();
				}

			} else
			if(i == 60)
			{
				int l = class30_sub2_sub2.method408();
				anIntArray73 = new int[l];
				for(int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = class30_sub2_sub2.readUnsignedShort();

			} else
			if(i == 90)
				class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 91)
				class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 92)
				class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 93)
				aBoolean87 = false;
			else
			if(i == 95)
				anInt61 = class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 97)
				anInt91 = class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 98)
				anInt86 = class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 99)
				aBoolean93 = true;
			else
			if(i == 100)
				anInt85 = class30_sub2_sub2.method409();
			else
			if(i == 101)
				anInt92 = class30_sub2_sub2.method409() * 5;
			else
			if(i == 102)
				anInt75 = class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 103)
				anInt79 = class30_sub2_sub2.readUnsignedShort();
			else
			if(i == 106)
			{
				anInt57 = class30_sub2_sub2.readUnsignedShort();
				if(anInt57 == 65535)
					anInt57 = -1;
				anInt59 = class30_sub2_sub2.readUnsignedShort();
				if(anInt59 == 65535)
					anInt59 = -1;
				int i1 = class30_sub2_sub2.method408();
				anIntArray88 = new int[i1 + 1];
				for(int i2 = 0; i2 <= i1; i2++)
				{
					anIntArray88[i2] = class30_sub2_sub2.readUnsignedShort();
					if(anIntArray88[i2] == 65535)
						anIntArray88[i2] = -1;
				}

			} else
			if(i == 107)
				aBoolean84 = false;
		} while(true);
	}

    Class5()
    {
        anInt55 = -1;
        anInt57 = -1;
        anInt58 = -1;
        anInt59 = -1;
        anInt61 = -1;
        anInt63 = 9;
        anInt64 = 1834;
        anInt67 = -1;
        aByte68 = 1;
        anInt69 = 9;
        anInt71 = -1;
        anInt75 = -1;
        anInt77 = -1;
        aLong78 = -1L;
        anInt79 = 32;
        aBoolean81 = false;
        anInt83 = -1;
        aBoolean84 = true;
        anInt86 = 128;
        aBoolean87 = true;
        anInt90 = -1;
        anInt91 = 128;
        aBoolean93 = false;
        anInt96 = -1;
    }

    public int anInt55;
    private static int anInt56;
    public int anInt57;
    public int anInt58;
    public int anInt59;
    private static Stream aClass30_Sub2_Sub2_60;
    public int anInt61;
    public static int anInt62;
    private int anInt63;
    private int anInt64;
    public String aString65;
    public String aStringArray66[];
    public int anInt67;
    public byte aByte68;
    private int anInt69;
    private int anIntArray70[];
    public int anInt71;
    private static int anIntArray72[];
    private int anIntArray73[];
    private static int anInt74 = 748;
    public int anInt75;
    private int anIntArray76[];
    public int anInt77;
    public long aLong78;
    public int anInt79;
    private static Class5 aClass5Array80[];
    private boolean aBoolean81;
    public static client aClient82;
    public int anInt83;
    public boolean aBoolean84;
    private int anInt85;
    private int anInt86;
    public boolean aBoolean87;
    public int anIntArray88[];
    public byte aByteArray89[];
    public int anInt90;
    private int anInt91;
    private int anInt92;
    public boolean aBoolean93;
    private int anIntArray94[];
    public static MRUNodes aClass12_95 = new MRUNodes(false, 30);
    public int anInt96;

}
