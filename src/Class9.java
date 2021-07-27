import sign.signlink;

public class Class9
{

    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1_207;
    public int anInt208;
    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1Array209[];
    public static Class9 aClass9Array210[];
    public int anInt211;
    public int anIntArray212[];
    private int anInt213;
    public int anInt214;
    public int anIntArray215[];
    public int anInt216;
    public int anInt217;
    public String aString218;
    public int anInt219;
    public int anInt220;
    public String aString221;
    public String aString222;
    public boolean aBoolean223;
    public int anInt224;
    public String aStringArray225[];
    public int anIntArrayArray226[][];
    public boolean aBoolean227;
    public String aString228;
    private int anInt229;
    public int anInt230;
    public int anInt231;
    public int anInt232;
    public int anInt233;
    public int anInt234;
    public boolean aBoolean235;
    public int anInt236;
    public int anInt237;
    private static MRUNodes aClass12_238;
    static Class44 aClass44;
    public int anInt239;
public static int transtAmount;
    public int anIntArray240[];
    public int anIntArray241[];
    public boolean aBoolean242;
    public Class30_Sub2_Sub1_Sub4 aClass30_Sub2_Sub1_Sub4_243;
    public int anInt244;
    public int anIntArray245[];
    public int anInt246;
    public int anIntArray247[];
    public String aString248;
    public boolean aBoolean249;
    public int anInt250;
    public boolean aBoolean251;
    public int anIntArray252[];
public String popupString;
    public int opacity;
    public boolean isMouseoverTriggered;
    public int mOverInterToTrigger;
    public int contentType;
    public boolean centerText;
    public boolean textShadow;
    public int anIntArray253[];
    public byte aByte254;
    public int anInt255;
    public int anInt256;
    public int anInt257;
    public int anInt258;
    public boolean aBoolean259;
    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1_260;
    public int anInt261;
    public int anInt262;
    public int anInt263;
    static MRUNodes aClass12_264 = new MRUNodes(false, 30);
    public int anInt265;
    public boolean aBoolean266;
    public int anInt267;
    public boolean aBoolean268;
    public int anInt269;
    public int anInt270;
    public int anInt271;
    public int anIntArray272[];

    public void method204(int i, byte byte0, int j)
    {
        int k = anIntArray253[i];
        anIntArray253[i] = anIntArray253[j];
        if(byte0 == 9)
        {
            byte0 = 0;
        } else
        {
            anInt229 = -76;
        }
        anIntArray253[j] = k;
        k = anIntArray252[i];
        anIntArray252[i] = anIntArray252[j];
        anIntArray252[j] = k;
    }
    private static Class30_Sub2_Sub1_Sub1 customsprite(int i, boolean flag, Class44 class44, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(signlink.findcachedir() +"/interface/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }
public static Class9 addDTab(int i)
	{
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt214 = 0;
        class9.anInt220 = 512;
        class9.anInt267 = 334;
        class9.aByte254 = 0;
        class9.anInt230 = 0;
        return class9;
	
	}
	public static void addText8(int i, String s,int k, boolean l, boolean m, int a,Class30_Sub2_Sub1_Sub4[] TDA, int j, int dsc) {
        Class9 class9 = addInterface(i);
        class9.anInt236 = i;
        class9.anInt250 = i;
        class9.anInt262 = 4;
        class9.anInt217 = 1;
        class9.anInt220 = 174;
        class9.anInt267 = 11;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = a;
        class9.aBoolean223 = l;
        class9.aBoolean268 = m;
        class9.aClass30_Sub2_Sub1_Sub4_243 = TDA[j];
        class9.aString248 = s;
        class9.aString228 = "";
		class9.anInt219 = 0;
        class9.anInt232 = k;
		class9.anInt239 = dsc;
		class9.aString221 = s;
    }
public static void addText3(int id, String text, Class30_Sub2_Sub1_Sub4 wid[], int idx, int color) {
		Class9 Tab = addTab(id);
		Tab.anInt250 = id;
		Tab.anInt236 = id;
		Tab.anInt262 = 4;
		Tab.anInt217 = 0;
		Tab.anInt220 = 174;
		Tab.anInt267 = 11;
		Tab.anInt214 = 0;
		Tab.aByte254 = 0;
		Tab.anInt230 = -1;
		Tab.aBoolean223 = false;
		Tab.aBoolean268 = true;
		Tab.aClass30_Sub2_Sub1_Sub4_243 = wid[idx];
		Tab.aString248 = text;
		Tab.aString228 = "";
		Tab.anInt232 = color;
		Tab.anInt219 = 0;
		Tab.anInt216 = 0;
		Tab.anInt239 = 0;	
	}

	public static void addText2(int i, String s,int k, boolean l, boolean m, int a,Class30_Sub2_Sub1_Sub4[] TDA, int j, int dsc) {
        Class9 class9 = addInterface(i);
        class9.anInt236 = i;
        class9.anInt250 = i;
        class9.anInt262 = 4;
        class9.anInt217 = 1;
        class9.anInt220 = 174;
        class9.anInt267 = 11;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = a;
        class9.aBoolean223 = l;
        class9.aBoolean268 = m;
        class9.aClass30_Sub2_Sub1_Sub4_243 = TDA[j];
        class9.aString248 = s;
        class9.aString228 = "";
		class9.anInt219 = 0;
        class9.anInt232 = k;
		class9.anInt239 = dsc;
		class9.aString221 = s;
    }

public static void addButton(int i, int j,String name, int W, int H, String S, int AT) {
        Class9 Class9 = addInterface(i);
        Class9.anInt250 = i;
        Class9.anInt236 = i;
        Class9.anInt262 = 5;
        Class9.anInt217 = AT;
        Class9.anInt214 = 0;
        Class9.aByte254 = 0;
        Class9.anInt230 = 52;
        Class9.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite(j,name);
        Class9.aClass30_Sub2_Sub1_Sub1_260 = LoadSprite(j,name);
        Class9.anInt220 = W;
        Class9.anInt267 = H;
        Class9.aString221 = S;
    }
private static Class30_Sub2_Sub1_Sub1 CustomWepLoader(int id, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)id;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null) { return class30_sub2_sub1_sub1; }
        try {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"/Sprites/Attack/"+id+s+".png");
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        } catch(Exception exception) { return null; }
        return class30_sub2_sub1_sub1;
    }

        public static void addSpecButton(int id, int sprite, int sprite2, int width, int height, String s)
    {
        Class9 class9 = aClass9Array210[id] = new Class9();
        class9.aClass30_Sub2_Sub1_Sub1_207 = CustomWepLoader(sprite, "");
        if (sprite2 == sprite)
          class9.aClass30_Sub2_Sub1_Sub1_260 = CustomWepLoader(sprite, "a");
        else
          class9.aClass30_Sub2_Sub1_Sub1_260 = CustomWepLoader(sprite2, "");
        class9.aString221 = s;
        class9.anInt214  = 0;
        class9.anInt217  = 1;
        class9.anInt220 = width;
        class9.anInt230  = 52;
        class9.anInt236 = id;
        class9.anInt250 = id;
        class9.anInt262 = 5;
        class9.anInt267 = height;
    }


    public static void addText(int id, String text, Class30_Sub2_Sub1_Sub4 wid[], int idx, int color, boolean centered) {
        Class9 class9 = aClass9Array210[id] = new Class9();
        if(centered)
          class9.aBoolean223 = true;
        class9.aBoolean268 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = wid[idx];
        class9.aString248 = text;
        class9.anInt232 = color;
        class9.anInt250 = id;
        class9.anInt262 = 4;
    }

public static void addAura(int i)
    {
        Class9 Class9 = aClass9Array210[i] = new Class9();
        Class9.aStringArray225 = new String[5];
        Class9.anIntArray215 = new int[20];
        Class9.anIntArray252 = new int[30];
        Class9.anIntArray253 = new int[30];
        Class9.anIntArray247 = new int[20];
        Class9.anIntArray240 = new int[0];
        Class9.anIntArray241 = new int[0];
        Class9.anIntArray272 = new int[0];
        Class9.anIntArray247[0] = 0;
        Class9.anIntArray252[0] = 0;
        Class9.anIntArray253[0] = 0;
        Class9.anIntArray252[0] = 0;
        Class9.aStringArray225[0] = "Time left";
        Class9.aStringArray225[1] = "Activate";
        Class9.aStringArray225[2] = null;
        Class9.aStringArray225[3] = null;
        Class9.aStringArray225[4] = null;
        Class9.aBoolean223 = false;
        Class9.aBoolean227 = false;
        Class9.aBoolean235 = false;
        Class9.aBoolean242 = false;
        Class9.aBoolean249 = false;
        Class9.aBoolean259 = true;
        Class9.aBoolean266 = false;
        Class9.aBoolean268 = false;
        Class9.anInt220 = 6;
        Class9.anInt229 = -1;
        Class9.anInt231 = 24;
        Class9.anInt236 = 10794;
        Class9.anInt244 = 24;
        Class9.anInt262 = 2;
        Class9.anInt267 = 5;
    }

private static Class30_Sub2_Sub1_Sub1 LoadSprite(int i, String s)
	{
	long l = (Class50.method585((byte)1, s) << 8) + (long)i;
	Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
	if(class30_sub2_sub1_sub1 != null) {
	return class30_sub2_sub1_sub1;
	}
	try {
	 class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(signlink.findcachedir() +"Sprites/").append(s).append(" ").append(i).append(".png").toString());
	aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
	} catch(Exception exception) {
	return null;
	}
	return class30_sub2_sub1_sub1;
	}
    public static void textColor(int id, int color)
    { Class9 class9 = aClass9Array210[id]; class9.anInt232 = color; }

    public static void textSize(int id, Class30_Sub2_Sub1_Sub4 wid[], int idx)
    { Class9 class9 = aClass9Array210[id]; class9.aClass30_Sub2_Sub1_Sub4_243 = wid[idx]; }

    public static void addCacheSprite(int id, int sprite1, int sprite2, String sprites)
    {
        Class9 class9 = aClass9Array210[id] = new Class9();
        class9.aClass30_Sub2_Sub1_Sub1_207 = method207(sprite1, false, aClass44, sprites);
        class9.aClass30_Sub2_Sub1_Sub1_260 = method207(sprite2, false, aClass44, sprites);
        class9.anInt236 = id;
        class9.anInt250 = id;
        class9.anInt262 = 5;
    }
    
    public static void sprite1(int id, int sprite)
    { Class9 class9 = aClass9Array210[id];
        class9.aClass30_Sub2_Sub1_Sub1_207 = CustomWepLoader(sprite, "");
    }


    public static void addToggleButton(int id, int sprite, int setconfig, int width, int height, String s)
    {
        Class9 class9 = addInterface(id);
        class9.aClass30_Sub2_Sub1_Sub1_207 = CustomWepLoader(sprite, "");
        class9.aClass30_Sub2_Sub1_Sub1_260 = CustomWepLoader(sprite, "a");
        class9.anIntArray212 = new int[1];
        class9.anIntArray212[0] = 1;
        class9.anIntArray245 = new int[1];
        class9.anIntArray245[0] = 1;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 5;
        class9.anIntArrayArray226[0][1] = setconfig;
        class9.anIntArrayArray226[0][2] = 0;
        class9.anInt217  = 4;
        class9.anInt220 = width;
        class9.anInt230  = -1;
        class9.anInt236 = id;
        class9.anInt250 = id;
        class9.anInt262 = 5;
        class9.anInt267 = height;
        class9.aString221  = s;
    }


    public void totalChildren(int id, int x, int y)
    { anIntArray240 = new int[id]; anIntArray241 = new int[x]; anIntArray272 = new int[y]; }

   public static void addActionButton(int i, int j, int k, int width, int height, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = width;
        class9.anInt267 = height;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = CustomSpriteLoader(j, "custom");
        class9.aClass30_Sub2_Sub1_Sub1_260 = CustomSpriteLoader(k, "custom");
        class9.aString221 = s;
    }

    public static void removeSomething(int i)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
    }

    public static void addText(int id, String text, Class30_Sub2_Sub1_Sub4 wid[], int idx, int color) {
                Class9 Tab = addTab(id);
                Tab.anInt250 = id;
                Tab.anInt236 = id;
                Tab.anInt262 = 4;
                Tab.anInt217 = 0;
                Tab.anInt220 = 174;
                Tab.anInt267 = 11;
                Tab.anInt214 = 0;
                Tab.aByte254 = 0;
                Tab.anInt230 = -1;
                Tab.aBoolean223 = false;
                Tab.aBoolean268 = true;
                Tab.aClass30_Sub2_Sub1_Sub4_243 = wid[idx];
                Tab.aString248 = text;
                Tab.aString228 = "";
                Tab.anInt232 = color;
                Tab.anInt219 = 0;
                Tab.anInt216 = 0;
                Tab.anInt239 = 0;        
        }

    public static void addChar(int ID) { 
        Class9 class9 = aClass9Array210[ID] = new Class9(); 
        class9.anInt250 = ID; 
        class9.anInt236 = ID; 
        class9.anInt262 = 6;
        class9.anInt217 = 0; 
        class9.anInt214 = 328; 
        class9.anInt220 = 136; 
        class9.anInt267 = 168; 
        class9.aByte254 = 0;
        class9.anInt230 = 0;
        class9.anInt269 = 560;
        class9.anInt270 = 150;
        class9.anInt271 = 0; 
        class9.anInt257 = -1; 
        class9.anInt258 = -1; 
}
private static Class30_Sub2_Sub1_Sub1 SpriteLoader(int i, String s) 
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"/Sprites/InterfaceSprites/"+s+" "+i+".png");
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}
    private static Class30_Sub2_Sub1_Sub1 CustomSpriteLoader(int i, String s) 
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"/Sprites/InterfaceSprites/"+s+" "+i+".png");
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}
public static void addBankHover(int i, int j, int k, int l, int i1, String s, int j1, int k1,
            int l1, int i2, String s1, int j2, int k2, int l2, String s2,
            int i3, String s3, String s4, int j3, int k3)
    {
        Class9 class9 = addInterface(i);
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = j;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = k;
        class9.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite(l, s);
        class9.aClass30_Sub2_Sub1_Sub1_260 = LoadSprite(i1, s);
        class9.anInt220 = j1;
        class9.aString221 = s1;
        class9.anInt267 = k1;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 1;
        class9.anIntArray212[0] = i2;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 5;
        class9.anIntArrayArray226[0][1] = l1;
        class9.anIntArrayArray226[0][2] = 0;
        class9 = addInterface(k);
        class9.anInt236 = k;
        class9.anInt250 = k;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 550;
        class9.anInt267 = 334;
        class9.aBoolean266 = true;
        class9.anInt230 = -1;
        addSprite2(j2, k2, l2, s2, i2, l1);
        addHoverBox(i3, i, s3, s4, i2, l1);
        setChildren(2, class9);
        setBounds(j2, 15, 60, 0, class9);
        setBounds(i3, j3, k3, 1, class9);
    }
 
    public static void addBankHover1(int i, int j, int k, int l, String s, int i1, int j1, String s1,
            int k1, int l1, String s2, int i2, String s3, int j2, int k2)
    {
        Class9 class9 = addInterface(i);
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = j;
        class9.anInt214 = 0;
        class9.aByte254 = 0;
        class9.anInt230 = k;
        class9.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite(l, s);
        class9.anInt220 = i1;
        class9.aString221 = s1;
        class9.anInt267 = j1;
        class9 = addInterface(k);
        class9.anInt236 = k;
        class9.anInt250 = k;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 550;
        class9.anInt267 = 334;
        class9.aBoolean266 = true;
        class9.anInt230 = -1;
        addSprite2(k1, l1, l1, s2, 0, 0);
        addHoverBox(i2, i, s3, s3, 0, 0);
        setChildren(2, class9);
        setBounds(k1, 15, 60, 0, class9);
        setBounds(i2, j2, k2, 1, class9);
    }

	public static void editInventories() {
		Class9 Tab = addTab(3213);
		Tab.anIntArray240 = new int[1];
		Tab.anIntArray241 = new int[1];
		Tab.anIntArray272 = new int[1];
		Tab.anIntArray240[0] = 3214;
		Tab.anIntArray241[0] = 4;
		Tab.anIntArray272[0] = 8;
		Tab = aClass9Array210[3214];
		Tab.anInt220 = 5;
		Tab.anInt267 = 7;
		Tab.anInt231 = 4;
		Tab.anIntArray252 = new int[35];
		Tab.anIntArray253 = new int[35];
		Tab = addTab(5063);
		Tab.anIntArray240 = new int[1];
		Tab.anIntArray241 = new int[1];
		Tab.anIntArray272 = new int[1];
		Tab.anIntArray240[0] = 5064;
		Tab.anIntArray241[0] = 4;
		Tab.anIntArray272[0] = 8;
		Tab = aClass9Array210[5064];
		Tab.anInt220 = 5;
		Tab.anInt267 = 7;
		Tab.anInt231 = 4;
		Tab.anIntArray252 = new int[35];
		Tab.anIntArray253 = new int[35];
		Tab = addTab(3822);
		Tab.anIntArray240 = new int[1];
		Tab.anIntArray241 = new int[1];
		Tab.anIntArray272 = new int[1];
		Tab.anIntArray240[0] = 3823;
		Tab.anIntArray241[0] = 4;
		Tab.anIntArray272[0] = 8;
		Tab = aClass9Array210[3823];
		Tab.anInt220 = 5;
		Tab.anInt267 = 7;
		Tab.anInt231 = 4;
		Tab.anIntArray252 = new int[7 * 5];
		Tab.anIntArray253 = new int[35];
		Tab = addTab(3822);
		Tab.anIntArray240 = new int[1];
		Tab.anIntArray241 = new int[1];
		Tab.anIntArray272 = new int[1];
		Tab.anIntArray240[0] = 3823;
		Tab.anIntArray241[0] = 4;
		Tab.anIntArray272[0] = 8;
		Tab = aClass9Array210[3416];
		Tab.anInt220 = 5;
		Tab.anInt267 = 7;
		Tab.anInt231 = 4;
		Tab.anIntArray252 = new int[7 * 5];
		Tab.anIntArray253 = new int[35];
		Tab = aClass9Array210[3415];
		Tab.anInt220 = 5;
		Tab.anInt267 = 7;
		Tab.anInt231 = 4;
		Tab.anIntArray252 = new int[7 * 5];
		Tab.anIntArray253 = new int[35];
		Tab = addTab(3321);
		Tab.anIntArray240 = new int[1];
		Tab.anIntArray241 = new int[1];
		Tab.anIntArray272 = new int[1];
		Tab.anIntArray240[0] = 3322;
		Tab.anIntArray241[0] = 4;
		Tab.anIntArray272[0] = 8;
		Tab = aClass9Array210[3322];
		Tab.anInt220 = 5;
		Tab.anInt267 = 7;
		Tab.anInt231 = 4;
		Tab.anIntArray252 = new int[35];
		Tab.anIntArray253 = new int[35];
	}

public static void addSprite2(int i, int j, int k, String s, int l, int i1)
    {
        Class9 class9 = addInterface(i);
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 0;
        class9.anInt214 = 0;
        class9.anInt220 = 512;
        class9.anInt267 = 334;
        class9.aByte254 = 0;
        class9.anInt230 = -1;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 1;
        class9.anIntArray212[0] = l;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 5;
        class9.anIntArrayArray226[0][1] = i1;
        class9.anIntArrayArray226[0][2] = 0;
        class9.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite(j, s);
        class9.aClass30_Sub2_Sub1_Sub1_260 = LoadSprite(k, s);
    }
        public static void addHover(int i, int aT, int cT, int hoverid,int sId, String NAME, int W, int H, String tip){
       
            Class9 hover = addInterface(i);
        hover.anInt250 = i;
        hover.anInt236 = i;
        hover.anInt262 = 5;
        hover.anInt217 = aT;
        hover.anInt214 = cT;
        hover.anInt230 = hoverid;
        hover.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite(sId, NAME);
        hover.aClass30_Sub2_Sub1_Sub1_260 = LoadSprite(sId, NAME);
        hover.anInt220 = W;
        hover.anInt267 = H;
        hover.aString221 = tip;
    }
        public static void addHovered(int i, int j, String imageName, int w, int h, int IMAGEID) {//hoverable button
        Class9 hover = addInterface(i);
        hover.anInt236 = i;
        hover.anInt250 = i;
        hover.anInt262 = 0;
        hover.anInt217 = 0;
        hover.anInt220 = w;
        hover.anInt267 = h;
        hover.aBoolean266 = true;
                hover.anInt230 = -1;
        addSprite(IMAGEID, j, imageName);
        setChildren(1, hover);
                setBounds(IMAGEID, 0, 0, 0, hover);
    }

        public static void Shop(Class30_Sub2_Sub1_Sub4[] var0) {
            Class9 var1 = addInterface(3824);
             setChildren(8, var1);
             addSprite(3825, 0, "Shop/SHOP");
             addHover(3902, 3, 0, 3826, 1, "Shop/CLOSE", 17, 17, "Close Window");
             addHovered(3826, 2, "Shop/CLOSE", 17, 17, 3827);
             addText8(19679, "", 16750623, false, true, 52, var0, 1);
             addText8(19680, "", 12547357, false, true, 52, var0, 1);
             addButton(19681, 2, "Shop/SHOP", 0, 0, "", 1);
             addSprite(19687, 1, "Shop/ITEMBG");
             setBounds(3825, 6, 8, 0, var1);
             setBounds(3902, 478, 10, 1, var1);
             setBounds(3826, 478, 10, 2, var1);
             setBounds(3900, 26, 44, 3, var1);
             setBounds(3901, 240, 11, 4, var1);
             setBounds(19679, 42, 54, 5, var1);
             setBounds(19680, 150, 54, 6, var1);
             setBounds(19681, 129, 50, 7, var1);
             var1 = aClass9Array210[3900];
             setChildren(1, var1);
             setBounds(19687, 6, 15, 0, var1);
             var1.anInt231 = 15;
             var1.anInt220 = 10;
             var1.anInt267 = 4;
             var1.anInt244 = 25;
             var1 = addTabInterface(19682);
             addSprite(19683, 1, "Shop/SHOP");
             addText8(19684, "Main Stock", 12547357, false, true, 52, var0, 1);
             addText8(19685, "Store Info", 16750623, false, true, 52, var0, 1);
             addButton(19686, 2, "Shop/SHOP", 95, 19, "Main Stock", 1);
             setChildren(7, var1);
             setBounds(19683, 12, 12, 0, var1);
             setBounds(3901, 240, 21, 1, var1);
             setBounds(19684, 42, 54, 2, var1);
             setBounds(19685, 150, 54, 3, var1);
             setBounds(19686, 23, 50, 4, var1);
             setBounds(3902, 471, 22, 5, var1);
             setBounds(3826, 60, 85, 6, var1);
          }
	public static void skilllevel(Class30_Sub2_Sub1_Sub4[] tda) {

	 Class9 text = aClass9Array210[7202];
	 Class9 attack = aClass9Array210[6247];
	 Class9 defence = aClass9Array210[6253];
	 Class9 str = aClass9Array210[6206];
	 Class9 hits = aClass9Array210[6216];
	 Class9 rng = aClass9Array210[4443];
	 Class9 pray = aClass9Array210[6242];
	 Class9 mage = aClass9Array210[6211];
	 Class9 cook = aClass9Array210[6226];
	 Class9 wood = aClass9Array210[4272];
	 Class9 flet = aClass9Array210[6231];
	 Class9 fish = aClass9Array210[6258];
	 Class9 fire = aClass9Array210[4282];
	 Class9 craf = aClass9Array210[6263];
	 Class9 smit = aClass9Array210[6221];
	 Class9 mine = aClass9Array210[4416];
	 Class9 herb = aClass9Array210[6237];
	 Class9 agil = aClass9Array210[4277];
	 Class9 thie = aClass9Array210[4261];
	 Class9 slay = aClass9Array210[12122];
	 Class9 farm = aClass9Array210[5267];
	 Class9 rune = aClass9Array210[4267];
	 Class9 cons = aClass9Array210[7267];
	 Class9 hunt = aClass9Array210[8267];
	 Class9 summ = addInterface(9267);
	 Class9 dung = addInterface(10267);
		addSprite(17878, 0, "Interfaces/skillchat/skill");
		addSprite(17879, 1, "Interfaces/skillchat/skill");
		addSprite(17880, 2, "Interfaces/skillchat/skill");
		addSprite(17881, 3, "Interfaces/skillchat/skill");
		addSprite(17882, 4, "Interfaces/skillchat/skill");
		addSprite(17883, 5, "Interfaces/skillchat/skill");
		addSprite(17884, 6, "Interfaces/skillchat/skill");
		addSprite(17885, 7, "Interfaces/skillchat/skill");
		addSprite(17886, 8, "Interfaces/skillchat/skill");
		addSprite(17887, 9, "Interfaces/skillchat/skill");
		addSprite(17888, 10, "Interfaces/skillchat/skill");
		addSprite(17889, 11, "Interfaces/skillchat/skill");
		addSprite(17890, 12, "Interfaces/skillchat/skill");
		addSprite(17891, 13, "Interfaces/skillchat/skill");
		addSprite(17892, 14, "Interfaces/skillchat/skill");
		addSprite(17893, 15, "Interfaces/skillchat/skill");
		addSprite(17894, 16, "Interfaces/skillchat/skill");
		addSprite(17895, 17, "Interfaces/skillchat/skill");
		addSprite(17896, 18, "Interfaces/skillchat/skill");
		addSprite(11897, 19, "Interfaces/skillchat/skill");	
		addSprite(17898, 20, "Interfaces/skillchat/skill");
		addSprite(17899, 21, "Interfaces/skillchat/skill");
		addSprite(17900, 22, "Interfaces/skillchat/skill");
		addSprite(17901, 23, "Interfaces/skillchat/skill");		
		addSprite(17902, 24, "Interfaces/skillchat/skill");
				setChildren(4, attack);
				setBounds(17878, 20, 30, 0, attack);
				setBounds(4268, 80, 15, 1, attack);
				setBounds(4269, 80, 45, 2, attack);
				setBounds(358, 95, 75, 3, attack);
				setChildren(4, defence);
				setBounds(17879, 20, 30, 0, defence);
				setBounds(4268, 80, 15, 1, defence);
				setBounds(4269, 80, 45, 2, defence);
				setBounds(358, 95, 75, 3, defence);
				setChildren(4, str);
				setBounds(17880, 20, 30, 0, str);
				setBounds(4268, 80, 15, 1, str);
				setBounds(4269, 80, 45, 2, str);
				setBounds(358, 95, 75, 3, str);
				setChildren(4, hits);
				setBounds(17881, 20, 30, 0, hits);
				setBounds(4268, 80, 15, 1, hits);
				setBounds(4269, 80, 45, 2, hits);
				setBounds(358, 95, 75, 3, hits);
				setChildren(4, rng);
				setBounds(17882, 20, 30, 0, rng);
				setBounds(4268, 80, 15, 1, rng);
				setBounds(4269, 80, 45, 2, rng);
				setBounds(358, 95, 75, 3, rng);
				setChildren(4, pray);
				setBounds(17883, 20, 30, 0, pray);
				setBounds(4268, 80, 15, 1, pray);
				setBounds(4269, 80, 45, 2, pray);
				setBounds(358, 95, 75, 3, pray);
				setChildren(4, mage);
				setBounds(17884, 20, 30, 0, mage);
				setBounds(4268, 80, 15, 1, mage);
				setBounds(4269, 80, 45, 2, mage);
				setBounds(358, 95, 75, 3, mage);
				setChildren(4, cook);
				setBounds(17885, 20, 30, 0, cook);
				setBounds(4268, 80, 15, 1, cook);
				setBounds(4269, 80, 45, 2, cook);
				setBounds(358, 95, 75, 3, cook);
				setChildren(4, wood);
				setBounds(17886, 20, 30, 0, wood);
				setBounds(4268, 80, 15, 1, wood);
				setBounds(4269, 80, 45, 2, wood);
				setBounds(358, 95, 75, 3, wood);
				setChildren(4, flet);
				setBounds(17887, 20, 30, 0, flet);
				setBounds(4268, 80, 15, 1, flet);
				setBounds(4269, 80, 45, 2, flet);
				setBounds(358, 95, 75, 3, flet);
				setChildren(4, fish);
				setBounds(17888, 20, 30, 0, fish);
				setBounds(4268, 80, 15, 1, fish);
				setBounds(4269, 80, 45, 2, fish);
				setBounds(358, 95, 75, 3, fish);
				setChildren(4, fire);
				setBounds(17889, 20, 30, 0, fire);
				setBounds(4268, 80, 15, 1, fire);
				setBounds(4269, 80, 45, 2, fire);
				setBounds(358, 95, 75, 3, fire);
				setChildren(4, craf);
				setBounds(17890, 20, 30, 0, craf);
				setBounds(4268, 80, 15, 1, craf);
				setBounds(4269, 80, 45, 2, craf);
				setBounds(358, 95, 75, 3, craf);
				setChildren(4, smit);
				setBounds(17891, 20, 30, 0, smit);
				setBounds(4268, 80, 15, 1, smit);
				setBounds(4269, 80, 45, 2, smit);
				setBounds(358, 95, 75, 3, smit);
				setChildren(4, mine);
				setBounds(17892, 20, 30, 0, mine);
				setBounds(4268, 80, 15, 1, mine);
				setBounds(4269, 80, 45, 2, mine);
				setBounds(358, 95, 75, 3, mine);
				setChildren(4, herb);
				setBounds(17893, 20, 30, 0, herb);
				setBounds(4268, 80, 15, 1, herb);
				setBounds(4269, 80, 45, 2, herb);
				setBounds(358, 95, 75, 3, herb);
				setChildren(4, agil);
				setBounds(17894, 20, 30, 0, agil);
				setBounds(4268, 80, 15, 1, agil);
				setBounds(4269, 80, 45, 2, agil);
				setBounds(358, 95, 75, 3, agil);
				setChildren(4, thie);
				setBounds(17895, 20, 30, 0, thie);
				setBounds(4268, 80, 15, 1, thie);
				setBounds(4269, 80, 45, 2, thie);
				setBounds(358, 95, 75, 3, thie);
				setChildren(4, slay);
				setBounds(17896, 20, 30, 0, slay);
				setBounds(4268, 80, 15, 1, slay);
				setBounds(4269, 80, 45, 2, slay);
				setBounds(358, 95, 75, 3, slay);
				setChildren(3, farm);
				setBounds(4268, 80, 15, 0, farm);
				setBounds(4269, 80, 45, 1, farm);
				setBounds(358, 95, 75, 2, farm);
				setChildren(4, rune);
				setBounds(17898, 20, 30, 0, rune);
				setBounds(4268, 80, 15, 1, rune);
				setBounds(4269, 80, 45, 2, rune);
				setBounds(358, 95, 75, 3, rune);
				setChildren(3, cons);
				setBounds(4268, 80, 15, 0, cons);
				setBounds(4269, 80, 45, 1, cons);
				setBounds(358, 95, 75, 2, cons);
				setChildren(3, hunt);
				setBounds(4268, 80, 15, 0, hunt);
				setBounds(4269, 80, 45, 1, hunt);
				setBounds(358, 95, 75, 2, hunt);
				setChildren(4, summ);
				setBounds(17901, 20, 30, 0, summ);
				setBounds(4268, 80, 15, 1, summ);
				setBounds(4269, 80, 45, 2, summ);
				setBounds(358, 95, 75, 3, summ);
				setChildren(4, dung);
				setBounds(17902, 20, 30, 0, dung);
				setBounds(4268, 80, 15, 1, dung);
				setBounds(4269, 80, 45, 2, dung);
				setBounds(358, 95, 75, 3, dung);
	}

		public static void questInterface(Class30_Sub2_Sub1_Sub4[] TDA) {
			Class9 Interface = addInterface(8134);
			Interface.aBoolean223 = true;
			addSprite(8135, 0, "QuestTab/QUESTBG");
			addSprite(8136, 1, "QuestTab/QUESTBG");
			addText8(8144, "Quest Name", 0x000000, true, false, 52, TDA, 3);//249 18
			addHover(8137, 3, 0, 8138, 0, "QuestTab/CLOSE", 26,23, "Close");
			addHovered(8138, 1, "QuestTab/CLOSE", 26, 23, 8139);
			setChildren(6, Interface);
			setBounds(8136, 18, 4, 0, Interface);
			setBounds(8135, 18, 62, 1, Interface);
			setBounds(8144, 260, 15, 2, Interface);
			setBounds(8140, 50, 86, 3, Interface);
			setBounds(8137, 452, 63, 4, Interface);
			setBounds(8138, 452, 63, 5, Interface);
			Interface = addInterface(8140);
			Interface.anInt267 = 217;//Height
			Interface.anInt220 = 404;//width
			Interface.anInt261 = 1300;//scroolmax
			setChildren(51, Interface);
			int Ypos = 18;
			int frameID = 0;
			for(int iD = 8145; iD <= 8195;iD++) {
				addText8(iD, "j", 0x000080, true, false, 52, TDA, 1);
				setBounds(iD, 202, Ypos, frameID, Interface);
				frameID++;
				Ypos += 19;
				Ypos ++;
			}
		}


public static void Bank()
    {
        Class9 class9 = addInterface(5292);
        setChildren(19, class9);
        addSprite(5293, 0, "BANK");
        setBounds(5293, 13, 13, 0, class9);
        addHover(5384, 3, 0, 5380, 1, "BANK", 17, 17, "Close Window");
        addHovered(5380, 2, "BANK", 17, 17, 5379);
        setBounds(5384, 476, 16, 3, class9);
        setBounds(5380, 476, 16, 4, class9);
        addHover(5294, 4, 0, 5295, 3, "BANK", 114, 25, "Set A Bank PIN");
        addHovered(5295, 4, "BANK", 114, 25, 5296);
        setBounds(5294, 110, 285, 5, class9);
        setBounds(5295, 110, 285, 6, class9);
        addBankHover(21000, 4, 21001, 5, 8, "BANK", 35, 25, 304, 1, "Switch to insert items mode", 21002, 7, 6, "BANK", 21003, "Switch to insert items \nmode", "Switch to swap items \nmode.", 12, 20);
        setBounds(21000, 25, 285, 7, class9);
        setBounds(21001, 10, 225, 8, class9);
        addBankHover(21004, 4, 21005, 13, 15, "BANK", 35, 25, 0, 1, "Search", 21006, 14, 16, "BANK", 21007, "Click here to search your \nbank", "Click here to search your \nbank", 12, 20);
        setBounds(21004, 65, 285, 9, class9);
        setBounds(21005, 50, 225, 10, class9);
        addBankHover(21008, 4, 21009, 9, 11, "BANK", 35, 25, 115, 1, "Switch to note withdrawal mode", 21010, 10, 12, "BANK", 21011, "Switch to note withdrawal \nmode", "Switch to item withdrawal \nmode", 12, 20);
        setBounds(21008, 240, 285, 11, class9);
        setBounds(21009, 225, 225, 12, class9);
        addBankHover1(21012, 5, 21013, 17, "BANK", 35, 25, "Deposit carried items", 21014, 18, "BANK", 21015, "Empty your backpack into\nyour bank", 0, 20);
        setBounds(21012, 375, 285, 13, class9);
        setBounds(21013, 360, 225, 14, class9);
        addBankHover1(21016, 5, 21017, 19, "BANK", 35, 25, "Deposit worn items", 21018, 20, "BANK", 21019, "Empty the items your are\nwearing into your bank", 0, 20);
        setBounds(21016, 415, 285, 15, class9);
        setBounds(21017, 400, 225, 16, class9);
        addBankHover1(21020, 5, 21021, 21, "BANK", 35, 25, "Deposit beast of burden inventory", 21022, 22, "BANK", 21023, "Empty your BoB's inventory\ninto your bank", 0, 20);
        setBounds(21020, 455, 285, 17, class9);
        setBounds(21021, 440, 225, 18, class9);
        setBounds(5383, 170, 15, 1, class9);
        setBounds(5385, -4, 74, 2, class9);
        class9 = aClass9Array210[5385];
        class9.anInt267 = 206;
        class9.anInt220 = 480;
        class9 = aClass9Array210[5382];
        class9.anInt220 = 10;
        class9.anInt231 = 12;
        class9.anInt267 = 35;
       
    }

public static void construction(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intconstruction = AddTab(15555);
intconstruction.anIntArray240 = new int[5];
intconstruction.anIntArray241 = new int[5];
intconstruction.anIntArray272 = new int[5];
//Main interface
intconstruction.anIntArray240[0] = 15556;
intconstruction.anIntArray241[0] = 4;
intconstruction.anIntArray272[0] = 16;
//No main interface image.
//Control 1 of main interface (Label)
intconstruction.anIntArray240[1] = 15557;
intconstruction.anIntArray241[1] = 243;
intconstruction.anIntArray272[1] = 49;
AddInterfaceLabel(15557, "Line1", wid, 3, 0x000000);
//Control 2 of main interface (Label)
intconstruction.anIntArray240[2] = 15558;
intconstruction.anIntArray241[2] = 243;
intconstruction.anIntArray272[2] = 80;
AddInterfaceLabel(15558, "Line2", wid, 3, 0x000000);
//Control 3 of main interface (ClickableLabel)
intconstruction.anIntArray240[3] = 15559;
intconstruction.anIntArray241[3] = 184;
intconstruction.anIntArray272[3] = 110;
AddClickableText(15559, "Click here to continue", "Continue", wid, 3, 0xFFA500, 167, 31);
//Control 4 of main interface (Image)
intconstruction.anIntArray240[4] = 15560;
intconstruction.anIntArray241[4] = 44;
intconstruction.anIntArray272[4] = 58;
AddInterfaceImage(15560, "construction", "20090711010916!Construction.png");
}


public static void pestcontrol2(Class30_Sub2_Sub1_Sub4[] wid) {
                Class9 class9 = addTab(18050);
                /* addText(ID, "Text", ???, Size, Colour); */
                addText(18051, "Next Departure: 0 seconds", wid, 1, 0xCCCBCB);
                addText(18052, "Players Ready: 0", wid, 1, 0x5AD230);
                addText(18053, "(Need 5 to 25 players)", wid, 1, 0xDED26A);
                addText(18054, "Pest Points: 0", wid, 1, 0x99FFFF);

                class9.anInt261 = 0;
                class9.aBoolean266 = false;
                class9.anIntArray240 = new int[4];
                class9.anIntArray241 = new int[4];
                class9.anIntArray272 = new int[4];

                class9.anIntArray240[0] = 18051;// first
                class9.anIntArray241[0] = 2;
                class9.anIntArray272[0] = 16;
                class9.anIntArray240[1] = 18052;// second
                class9.anIntArray241[1] = 2;
                class9.anIntArray272[1] = 33;
                class9.anIntArray240[2] = 18053;// third
                class9.anIntArray241[2] = 2;
                class9.anIntArray272[2] = 50;
                class9.anIntArray240[3] = 18054;// forth
                class9.anIntArray241[3] = 2;
                class9.anIntArray272[3] = 66;

        }

    public static void addHoverBox(int i, int j, String s, String s1, int k, int l)
    {
        Class9 class9 = addInterface(i);
        class9.anInt250 = i;
        class9.anInt236 = j;
        class9.anInt262 = 8;
        class9.aString248 = s;
        class9.aString248 = s1;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 1;
        class9.anIntArray212[0] = k;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 5;
        class9.anIntArrayArray226[0][1] = l;
        class9.anIntArrayArray226[0][2] = 0;
    }
    public static void addSpellClick4(int i, int j, int k)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = Run(j, "custom2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = Run(k, "custom2");
    }
    public static void addInterfaceSprite(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 1;
        class9.anInt267 = 1;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = CustomSpriteLoader(j, "Custom");
        class9.aClass30_Sub2_Sub1_Sub1_260 = CustomSpriteLoader(k, "Custom");
        class9.aString221 = s;
    }
private static Class30_Sub2_Sub1_Sub1 GetInterfaceImage(String interfaceName, String s)
{
	//Basically, just a user-friedly edited version of an old one.
	long l = (Class50.method585((byte)1, s) << 8);
	Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
	if(class30_sub2_sub1_sub1 != null)
	{
	return class30_sub2_sub1_sub1;
	}
	try
	{
	class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"/Sprites/InterfaceSprites/Interface Images/" + interfaceName + "/" + s);
	aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
	}
	catch(Exception exception)
	{
	return null;
	}
	return class30_sub2_sub1_sub1;
}

public static void AddInterfaceImage(int i, String interfaceName, String spriteName)
{
	Class9 dSprite = aClass9Array210[i] = new Class9();
	dSprite.anInt250 = i;
	dSprite.anInt236 = i;
	dSprite.anInt262 = 5;
	dSprite.anInt217 = 1;
	dSprite.anInt214 = 0;
	dSprite.anInt220 = 20;
	dSprite.anInt267 = 20;
	dSprite.aByte254 = 0;
	dSprite.anInt230 = 52;
	dSprite.aClass30_Sub2_Sub1_Sub1_207 = GetInterfaceImage(interfaceName, spriteName);
	dSprite.aClass30_Sub2_Sub1_Sub1_260 = GetInterfaceImage(interfaceName, spriteName);
}

    public static void addPrayer99(int i, int configId, int configFrame, int requiredValues, int prayerSpriteID

, int hoverID, String PrayerName) {
        Class9 Interface = addInterface(i);
        Interface.anInt250 = i;
        Interface.anInt236 = 5608;
        Interface.anInt262 = 5;
        Interface.anInt217 = 4;
        Interface.anInt214 = 0;
        Interface.aByte254 = 0;
        Interface.anInt230 = -1;
        Interface.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite99(1, "Prayer/PRAYERGLOW");
        Interface.aClass30_Sub2_Sub1_Sub1_260 = LoadSprite99(0, "Prayer/PRAYERGLOW");
        Interface.anInt220 = 34;
        Interface.anInt267 = 34;
        Interface.anIntArray245 = new int[1];
        Interface.anIntArray212 = new int[1];
        Interface.anIntArray245[0] = 3;
        Interface.anIntArray212[0] = configId;
        Interface.anIntArrayArray226 = new int[1][3];
        Interface.anIntArrayArray226[0][0] = 5;
        Interface.anIntArrayArray226[0][1] = configFrame;
        Interface.anIntArrayArray226[0][2] = 0;
        Interface.aString221 = "Activate@or1@ " + PrayerName;
        Interface = addInterface(i + 1);
        Interface.anInt250 = i + 1;
        Interface.anInt236 = 5608;
        Interface.anInt262 = 5;
        Interface.anInt217 = 0;
        Interface.anInt214  = 0;
        Interface.aByte254 = 0;
        Interface.anInt230 = hoverID;
        Interface.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite99(prayerSpriteID, "Prayer/PRAYEROFF");
        Interface.aClass30_Sub2_Sub1_Sub1_260 = LoadSprite99(prayerSpriteID, "Prayer/PRAYERON");
        Interface.anInt220 = 34;
        Interface.anInt267 = 34;
        Interface.anIntArray245 = new int[1];
        Interface.anIntArray212 = new int[1];
        Interface.anIntArray245[0] = 3;
        Interface.anIntArray212[0] = requiredValues + 1;
        Interface.anIntArrayArray226 = new int[1][3];
        Interface.anIntArrayArray226[0][0] = 2;
        Interface.anIntArrayArray226[0][1] = 5;
        Interface.anIntArrayArray226[0][2] = 0;
        Interface = addInterface(hoverID);
        Interface.anInt250 = hoverID;
        Interface.anInt236 = 5608;
        Interface.anInt262 = 0;
        Interface.anInt217 = 0;
        Interface.anInt214  = 0;
        Interface.aByte254 = 0;
        Interface.anInt230 = -1;
        Interface.anInt220 = 512;
        Interface.anInt267 = 334;
        Interface.aBoolean266 = true;

        addSprite99(hoverID + 1, prayerSpriteID, "Prayer/PRAYERHOVER");
        setChildren(1, Interface);
        setBounds(hoverID + 1, 3, 5, 0, Interface);
    }
    public static void addSprite99(int ID, int i, String name) {
        Class9 Tab = addInterface(ID);
        Tab.anInt250 = ID;
        Tab.anInt236 = ID;
        Tab.anInt262 = 5;
        Tab.anInt217 = 0;
        Tab.anInt214 = 0;
        Tab.anInt220 = 512;
        Tab.anInt267 = 334;
        Tab.aByte254 = (byte) 0;
        Tab.anInt230 = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite99(i, name);
        Tab.aClass30_Sub2_Sub1_Sub1_260 = LoadSprite99(i, name);
    }
	   private static Class30_Sub2_Sub1_Sub1 LoadSprite99(int i, String s){
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)	

aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null) {
            return class30_sub2_sub1_sub1;
        }
        try{
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"/Sprites/"+s+" "+i+".PNG");
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }catch(Exception exception){
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

  public static void Prayer(Class30_Sub2_Sub1_Sub4[] TDA) {
        Class9 Interface = addInterface(19195);
        int index = 0;
        int prayIndex = 0;
        setChildren(80, Interface);

        //addPrayer(int i, int configId, int configFrame, int requiredValues, int prayerSpriteID)
        addText8(25104, "99/99", 0xFF981F, false, false, -1, TDA, 1);
        addSprite99(25105, 0, "Prayer/PRAYERICO");
        addPrayer99(25000, 0, 83, 0, prayIndex, 25052, "Thick Skin");
        					prayIndex++;
        setBounds(25000, 2, 5, index, Interface);
       					index++;//Glow
        setBounds(25001, 5, 8, index, Interface);
        					index++;//Icon
        addPrayer99(25002, 0, 84, 3, prayIndex, 25054,"Burst of Strength");
        					prayIndex++;
        setBounds(25002, 40, 5, index, Interface);
        					index++;//Glow
        setBounds(25003, 44, 8, index, Interface);
        					index++;//Icon
        addPrayer99(25004, 0, 85, 6, prayIndex, 25056, "Clarity of Thought");
        					prayIndex++;
        setBounds(25004, 76, 5, index, Interface);
        					index++;//Glow
        setBounds(25005, 79, 11, index, Interface);
        					index++;//Icon
        addPrayer99(25006, 0, 101, 7, prayIndex, 25058,"Sharp Eye");
        					prayIndex++;
        setBounds(25006, 113, 5, index, Interface);
        					index++;//Glow
        setBounds(25007, 116, 10, index, Interface);
       					index++;//Icon
        addPrayer99(25008, 0, 102, 8, prayIndex, 25060,"Mystic Will");
        					prayIndex++;
        setBounds(25008, 150, 5, index, Interface);
        					index++;//Glow
        setBounds(25009, 153, 9, index, Interface);
        					index++;//Icon
        addPrayer99(25010, 0, 86, 9, prayIndex, 25062,"Rock Skin");
        					prayIndex++;
        setBounds(25010, 2, 45, index, Interface);
        					index++;//Glow
        setBounds(25011, 5, 48, index, Interface);
        					index++;//Icon
        addPrayer99(25012, 0, 87, 12, prayIndex, 25064,"Superhuman Strength");
        					prayIndex++;
        setBounds(25012, 39, 45, index, Interface);
        					index++;//Glow
        setBounds(25013, 44, 47, index, Interface);
        					index++;//Icon
        addPrayer99(25014, 0, 88, 15, prayIndex, 25066,"Improved Reflexes");
        					prayIndex++;
        setBounds(25014, 76, 45, index, Interface);
        					index++;//Glow
        setBounds(25015, 79, 49, index, Interface);
        					index++;//Icon
        addPrayer99(25016, 0, 89, 18, prayIndex, 25068,"Rapid Restore");
        					prayIndex++;
        setBounds(25016, 113, 45, index, Interface);
        					index++;//Glow
        setBounds(25017, 116, 50, index, Interface);
        					index++;//Icon
        addPrayer99(25018, 0, 90, 21, prayIndex, 25070, "Rapid Heal");
        					prayIndex++;
        setBounds(25018, 151, 45, index, Interface);
        					index++;//Glow
        setBounds(25019, 154, 50, index, Interface);
        					index++;//Icon
        addPrayer99(25020, 0, 91, 24, prayIndex, 25072,"Protect Item");
        					prayIndex++;
        setBounds(25020, 2, 82, index, Interface);
        					index++;//Glow
        setBounds(25021, 4, 84, index, Interface);
        					index++;//Icon
        addPrayer99(25022, 0, 103, 25, prayIndex, 25074, "Hawk Eye");
        					prayIndex++;
        setBounds(25022, 40, 82, index, Interface);
        					index++;//Glow
        setBounds(25023, 42, 86, index, Interface);
        					index++;//Icon
        addPrayer99(25024, 0, 104, 26, prayIndex, 25076,"Mystic Lore");
        					prayIndex++;
        setBounds(25024, 77, 82, index, Interface);
        					index++;//Glow
        setBounds(25025, 79, 84, index, Interface);
        					index++;//Icon
        addPrayer99(25026, 0, 92, 27, prayIndex, 25078,"Steel Skin");
        					prayIndex++;
        setBounds(25026, 114, 83, index, Interface);
        					index++;//Glow
        setBounds(25027, 117, 85, index, Interface);
        					index++;//Icon
        addPrayer99(25028, 0, 93, 30, prayIndex, 25080,"Ultimate Strength");
        					prayIndex++;
        setBounds(25028, 153, 83, index, Interface);
        					index++;//Glow
        setBounds(25029, 156, 87, index, Interface);
        					index++;//Icon
        addPrayer99(25030, 0, 94, 33, prayIndex, 25082,"Incredible Reflexes");
        					prayIndex++;
        setBounds(25030, 2, 120, index, Interface);
        					index++;//Glow
        setBounds(25031, 5, 125, index, Interface);
        					index++;//Icon
        addPrayer99(25032, 0, 95, 36, prayIndex, 25084,"Protect from Magic");
        					prayIndex++;
        setBounds(25032, 40, 120, index, Interface);
        					index++;//Glow
        setBounds(25033, 43, 124, index, Interface);
       					index++;//Icon
        addPrayer99(25034, 0, 96, 39, prayIndex, 25086,"Protect from Missiles");
        					prayIndex++;
        setBounds(25034, 78, 120, index, Interface);
        					index++;//Glow
        setBounds(25035, 83, 124, index, Interface);
        					index++;//Icon
        addPrayer99(25036, 0, 97, 42, prayIndex, 25088,"Protect from Melee");
        					prayIndex++;
        setBounds(25036, 114, 120, index, Interface);
        					index++;//Glow
        setBounds(25037, 115, 121, index, Interface);
        					index++;//Icon
        addPrayer99(25038, 0, 105, 43, prayIndex, 25090,"Eagle Eye");
        					prayIndex++;
        setBounds(25038, 151, 120, index, Interface);
        					index++;//Glow
        setBounds(25039, 153, 124, index, Interface);
        					index++;//Icon
        addPrayer99(25040, 0, 106, 44, prayIndex, 25092,"Mystic Might");
        prayIndex++;
        setBounds(25040, 2, 158, index, Interface);
        					index++;//Glow
        setBounds(25041, 4, 160, index, Interface);
        					index++;//Icon
        addPrayer99(25042, 0, 98, 45, prayIndex, 25094,"Retribution");
        					prayIndex++;
        setBounds(25042, 39, 158, index, Interface);
        					index++;//Glow
        setBounds(25043, 41, 158, index, Interface);
        					index++;//Icon
        addPrayer99(25044, 0, 99, 48, prayIndex, 25096,"Redemption");
        					prayIndex++;
        setBounds(25044, 76, 158, index, Interface);
        					index++;//Glow
        setBounds(25045, 78, 162, index, Interface);
        					index++;//Icon
        addPrayer99(25046, 0, 100, 51, prayIndex, 25098,"Smite");
        					prayIndex++;
        setBounds(25046, 114, 158, index, Interface);
        					index++;//Glow
        setBounds(25047, 116, 158, index, Interface);
        					index++;//Icon
        addPrayer99(25048, 0, 107, 59, prayIndex, 25100,"Chivalry");
       					prayIndex++;
        setBounds(25048, 153, 158, index, Interface);
        					index++;//Glow
        setBounds(25049, 160, 159, index, Interface);
        					index++;//Icon
        addPrayer99(25050, 0, 108, 69, prayIndex, 25102,"Piety");
        					prayIndex++;
        setBounds(25050, 2, 199, index, Interface);
        					index++;//Glow
        setBounds(25051, 3, 210, index, Interface);
        					index++;//Icon
        setBounds(25052, 12, 42, index, Interface);
        					index++;//Hover
        setBounds(25054, 8, 42, index, Interface);
        	index++;//Hover
        setBounds(25056, 20, 42, index, Interface);
        	index++;//Hover
        setBounds(25058, 12, 42, index, Interface);
       	index++;//Hover
        setBounds(25060, 24, 42, index, Interface);
        	index++;//Hover
        setBounds(25062, 6, 80, index, Interface);
        	index++;//Hover
        setBounds(25064, 2, 80, index, Interface);
        	index++;//Hover
        setBounds(25066, 16, 80, index, Interface);
        	index++;//Hover
        setBounds(25068, 24, 80, index, Interface);
        	index++;//Hover
        setBounds(25070, 50, 80, index, Interface);
        	index++;//Hover
        setBounds(25072, 28, 118, index, Interface);
        	index++;//Hover
        setBounds(25074, 12, 118, index, Interface);
        	index++;//Hover
        setBounds(25076, 10, 118, index, Interface);
        	index++;//Hover
        setBounds(25078, 6, 118, index, Interface);
        	index++;//Hover
        setBounds(25080, 8, 118, index, Interface);
        	index++;//Hover
        setBounds(25082, 28, 150, index, Interface);
        	index++;//Hover
        setBounds(25084, 28, 150, index, Interface);
        	index++;//Hover
        setBounds(25086, 28, 150, index, Interface);
        	index++;//Hover
        setBounds(25088, 28, 150, index, Interface);
        	index++;//Hover
        setBounds(25090, 28, 150, index, Interface);
        	index++;//Hover
        setBounds(25092, 28, 110, index, Interface);
        	index++;//Hover
        setBounds(25094, 28, 110, index, Interface);
        	index++;//Hover
        setBounds(25096, 28, 110, index, Interface);
        	index++;//Hover
        setBounds(25098, 50, 110, index, Interface);
        	index++;//Hover
        setBounds(25100, 28, 110, index, Interface);
        	index++;//Hover
        setBounds(25102, 12, 110, index, Interface);
        	index++;//Hover
        setBounds(25104, 85, 241, index, Interface);
        	index++;//Text
        setBounds(25105, 65, 241, index, Interface);
        	index++;//Icon
    }

private static Class30_Sub2_Sub1_Sub1 CursesLoader(int i, String s) {
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"/Sprites/"+s+" "+i+".PNG");
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}

public static void Curses(Class30_Sub2_Sub1_Sub4[] TDA) {
        Class9 Interface = addTabInterface(22500);
        int index = 0;
        setChildren(62, Interface);
        addText8(22501, "99/99", 0xFF981F, false, false, -1, TDA, 1);
        /*Top Row*/
        addPrayer(22503, 0, 83, 49, 7, "Protect Item", 22542);
        setBounds(22503, 2, 5, index, Interface);index++;//Glow
        setBounds(22504, 8, 8, index, Interface);index++;//Icon
        addPrayer(22505, 0, 84, 49, 4, "Sap Warrior", 22544);
        setBounds(22505, 40, 5, index, Interface);index++;//Glow
        setBounds(22506, 47, 12, index, Interface);index++;//Icon
        addPrayer(22507, 0, 85, 51, 5, "Sap Ranger", 22546);
        setBounds(22507, 76, 5, index, Interface);index++;//Glow
        setBounds(22508, 82, 11, index, Interface);index++;//Icon
        addPrayer(22509, 0, 101, 53, 3, "Sap Mage", 22548);
        setBounds(22509, 113, 5, index, Interface);index++;//Glow
        setBounds(22510, 116, 8, index, Interface);index++;//Icon
        addPrayer(22511, 0, 102, 55, 2, "Sap Spirit", 22550);
        setBounds(22511, 150, 5, index, Interface);index++;//Glow
        setBounds(22512, 155, 10, index, Interface);index++;//Icon
        /*2nd Row*/
        addPrayer(22513, 0, 86, 58, 18, "Berserker", 22552);
        setBounds(22513, 2, 45, index, Interface);index++;//Glow
        setBounds(22514, 9, 48, index, Interface);index++;//Icon
        addPrayer(22515, 0, 87, 61, 15, "Deflect Summoning", 22554);
        setBounds(22515, 39, 45, index, Interface);index++;//Glow
        setBounds(22516, 42, 47, index, Interface);index++;//Icon
        addPrayer(22517, 0, 88, 64, 17, "Deflect Magic", 22556);
        setBounds(22517, 76, 45, index, Interface);index++;//Glow
        setBounds(22518, 79, 48, index, Interface);index++;//Icon
        addPrayer(22519, 0, 89, 67, 16, "Deflect Missiles", 22558);
        setBounds(22519, 113, 45, index, Interface);index++;//Glow
        setBounds(22520, 116, 48, index, Interface);index++;//Icon
        addPrayer(22521, 0, 90, 70, 6, "Deflect Melee", 22560);
        setBounds(22521, 151, 45, index, Interface);index++;//Glow
        setBounds(22522, 154, 48, index, Interface);index++;//Icon
        /*3rd Row*/
        addPrayer(22523, 0, 91, 73, 9, "Leech Attack", 22562);
        setBounds(22523, 2, 82, index, Interface);index++;//Glow
        setBounds(22524, 6, 86, index, Interface);index++;//Icon
        addPrayer(22525, 0, 103, 75, 10, "Leech Ranged", 22564);
        setBounds(22525, 40, 82, index, Interface);index++;//Glow
        setBounds(22526, 42, 86, index, Interface);index++;//Icon
        addPrayer(22527, 0, 104, 77, 11, "Leech Magic", 22566);
        setBounds(22527, 77, 82, index, Interface);index++;//Glow
        setBounds(22528, 79, 86, index, Interface);index++;//Icon
        addPrayer(22529, 0, 92, 79, 12, "Leech Defence", 22568);
        setBounds(22529, 114, 83, index, Interface);index++;//Glow
        setBounds(22530, 119, 87, index, Interface);index++;//Icon
        addPrayer(22531, 0, 93, 81, 13, "Leech Strength", 22570);
        setBounds(22531, 153, 83, index, Interface);index++;//Glow
        setBounds(22532, 156, 86, index, Interface);index++;//Icon
        /*Bottom Row*/
        addPrayer(22533, 0, 94, 83, 14, "Leech Energy", 22572);
        setBounds(22533, 2, 120, index, Interface);index++;//Glow
        setBounds(22534, 7, 125, index, Interface);index++;//Icon
        addPrayer(22535, 0, 95, 85, 19, "Leech Special Attack", 22574);
        setBounds(22535, 40, 120, index, Interface);index++;//Glow
        setBounds(22536, 45, 124, index, Interface);index++;//Icon
        addPrayer(22537, 0, 96, 88, 1, "Wrath", 22576);
        setBounds(22537, 78, 120, index, Interface);index++;//Glow
        setBounds(22538, 86, 124, index, Interface);index++;//Icon
        addPrayer(22539, 0, 97, 91, 8, "Soul Split", 22578);
        setBounds(22539, 114, 120, index, Interface);index++;//Glow
        setBounds(22540, 120, 125, index, Interface);index++;//Icon
        addPrayer(22541, 0, 105, 94, 0, "Turmoil", 22580);
        setBounds(22541, 151, 120, index, Interface);index++;//Glow
        setBounds(22542, 153, 127, index, Interface);index++;//Icon
        /*Prayer Icon/Text*/
        addSprite(22502, 0, "Curses/ICON");
        setBounds(22501, 85, 241, index, Interface);index++;//Text
        setBounds(22502, 65, 241, index, Interface);index++;//Icon
        /*Tooltips/Hover Boxes*/
        addTooltip(22542, "Level 50\nProtect Item\nKeep 1 extra item if you die", 100, 150);
        addTooltip(22544, "Level 50\nSap Warrior\nDrains 10% of enemy Attack,\nStrength and Defence,\nincreasing to 20% over time", 100, 150);
        addTooltip(22546, "Level 52\nSap Ranger\nDrains 10% of enemy Ranged\nand Defence, increasing to 20%\nover time", 100, 175);
        addTooltip(22548, "Level 54\nSap Mage\nDrains 10% of enemy Magic\nand Defence, increasing to 20%\nover time", 100, 175);
        addTooltip(22550, "Level 56\nSap Spirit\nDrains enenmy special attack\nenergy", 100, 175);
        addTooltip(22552, "Level 59\nBerserker\nBoosted stats last 15% longer", 100, 175);
        addTooltip(22554, "Level 62\nDeflect Summoning\nReduces damage dealt from\nSummoning scrolls, prevents the\nuse of a familiar's special\nattack, and can deflect some of\ndamage back to the attacker", 125, 175);
        addTooltip(22556, "Level 65\nDeflect Magic\nProtects against magical attacks\nand can deflect some of the\ndamage back to the attacker", 100, 175);
        addTooltip(22558, "Level 68\nDeflect Missiles\nProtects against ranged attacks\nand can deflect some of the\ndamage back to the attacker", 100, 175);
        addTooltip(22560, "Level 71\nDeflect Melee\nProtects against melee attacks\nand can deflect some of the\ndamage back to the attacker", 100, 175);
        addTooltip(22562, "Level 74\nLeech Attack\nBoosts Attack by 5%, increasing\nto 10% over time, while draining\nenemy Attack by 10%,\nincreasing to 25% over time", 100, 175);
        addTooltip(22564, "Level 76\nLeech Ranged\nBoosts Ranged by 5%, increasing\nto 10% over time,\nwhile draining enemy Ranged by\n10%, increasing to 25% over\ntime", 113, 175);
        addTooltip(22566, "Level 78\nLeech Magic\nBoosts Magic by 5%, increasing\nto 10% over time, while draining\nenemy Magic by 10%, increasing\nto 25% over time", 100, 175);
        addTooltip(22568, "Level 80\nLeech Defence\nBoosts Defence by 5%, increasing\nto 10% over time,\nwhile draining enemy Defence by\n10%, increasing to 25% over\ntime", 113, 180);
        addTooltip(22570, "Level 82\nLeech Strength\nBoosts Strength by 5%, increasing\nto 10% over time,\nwhile draining enemy Strength by\n10%, increasing to 25% over\ntime", 113, 180);
        addTooltip(22572, "Level 84\nLeech Energy\nDrains enemy run energy, while\nincreasing your own", 113, 180);
        addTooltip(22574, "Level 86\nLeech Special Attack\nDrains enemy special attack\nenergy, while increasing your\nown", 113, 180);
        addTooltip(22576, "Level 89\nWrath\nInflicts damage to nearby\ntargets if you die", 113, 180);
        addTooltip(22578, "Level 92\nSoul Split\n1/4 of damage dealt is\nalso removed from\nopponent's Prayer and added to\nyour Hitpoints", 113, 180);
        addTooltip(22580, "Level 95\nTurmoil\nIncreases Attack and Defence\nby 15%, plus 15% of enemy's\nlevel, and Strength by 23% plus\n10% of enemy's level", 113, 180);
        setBounds(22542, 10, 40, index, Interface);index++;
        setBounds(22544, 20, 40, index, Interface);index++;
        setBounds(22546, 20, 40, index, Interface);index++;
        setBounds(22548, 20, 40, index, Interface);index++;
        setBounds(22550, 20, 40, index, Interface);index++;
        setBounds(22552, 10, 80, index, Interface);index++;
        setBounds(22554, 10, 80, index, Interface);index++;
        setBounds(22556, 10, 80, index, Interface);index++;
        setBounds(22558, 10, 80, index, Interface);index++;
        setBounds(22560, 10, 80, index, Interface);index++;
        setBounds(22562, 10, 120, index, Interface);index++;
        setBounds(22564, 10, 120, index, Interface);index++;
        setBounds(22566, 10, 120, index, Interface);index++;
        setBounds(22568, 5, 120, index, Interface);index++;
        setBounds(22570, 5, 120, index, Interface);index++;
        setBounds(22572, 10, 160, index, Interface);index++;
        setBounds(22574, 10, 160, index, Interface);index++;
        setBounds(22576, 10, 160, index, Interface);index++;
        setBounds(22578, 10, 160, index, Interface);index++;
        setBounds(22580, 10, 160, index, Interface);index++;
	}

public static void AddInterfaceButton(int i, int width, int height, String tooltip, String interfaceName, String spriteName)
{
	Class9 class9 = aClass9Array210[i] = new Class9();
	class9.anInt250 = i;
	class9.anInt236 = i;
	class9.anInt262 = 5;
	class9.anInt217 = 1;
	class9.anInt214 = 0;
	class9.anInt220 = width;
	class9.anInt267 = height;
	class9.aByte254 = 0;
	class9.anInt230 = 52;
	class9.aClass30_Sub2_Sub1_Sub1_207 = GetInterfaceImage(interfaceName, spriteName);
	class9.aClass30_Sub2_Sub1_Sub1_260 = GetInterfaceImage(interfaceName, spriteName);
	class9.aString221 = tooltip;
}

public static void setChildren(int total,Class9 i){
        i.anIntArray240 = new int[total];
        i.anIntArray241 = new int[total];
        i.anIntArray272 = new int[total];
    }
    public void totalChildren(int t) {
        anIntArray240 = new int[t];
        anIntArray241 = new int[t];
        anIntArray272 = new int[t];
    }

    public void child7(int id, int interID, int x, int y) {
        anIntArray240[id] = interID;
        anIntArray241[id] = x;
        anIntArray272[id] = y;
    }
    public static void setBounds(int ID, int X, int Y, int frame, Class9 Class9){
        Class9.anIntArray240[frame] = ID;
        Class9.anIntArray241[frame] = X;
        Class9.anIntArray272[frame] = Y;
    }

public static void addPrayer(int i, int configId, int configFrame, int requiredValues, int prayerSpriteID, String PrayerName, int Hover) {
        Class9 Interface = addTabInterface(i);
        Interface.anInt250 = i;
        Interface.anInt236 = 22500;
        Interface.anInt262 = 5;
        Interface.anInt217 = 4;
        Interface.contentType = 0;
        Interface.aByte254 = 0;
        Interface.mOverInterToTrigger = Hover;
        Interface.aClass30_Sub2_Sub1_Sub1_207 = CustomSpriteLoader(0, "Curses/GLOW");
        Interface.aClass30_Sub2_Sub1_Sub1_260 = CustomSpriteLoader(1, "Curses/GLOW");
        Interface.anInt220 = 34;
        Interface.anInt267 = 34;
        Interface.anIntArray245 = new int[1];
        Interface.anIntArray212 = new int[1];
        Interface.anIntArray245[0] = 1;
        Interface.anIntArray212[0] = configId;
        Interface.anIntArrayArray226 = new int[1][3];
        Interface.anIntArrayArray226[0][0] = 5;
        Interface.anIntArrayArray226[0][1] = configFrame;
        Interface.anIntArrayArray226[0][2] = 0;
        Interface.aString221 = "Activate@or1@ " + PrayerName;
        Interface = addTabInterface(i + 1);
        Interface.anInt250 = i + 1;
        Interface.anInt236 = 22500;
        Interface.anInt262 = 5;
        Interface.anInt217 = 0;
        Interface.contentType  = 0;
        Interface.aByte254 = 0;
        Interface.aClass30_Sub2_Sub1_Sub1_207 = CursesLoader(prayerSpriteID, "Curses/PRAYON");
        Interface.aClass30_Sub2_Sub1_Sub1_260 = CursesLoader(prayerSpriteID, "Curses/PRAYOFF");
        Interface.anInt220 = 34;
        Interface.anInt267 = 34;
        Interface.anIntArray245 = new int[1];
        Interface.anIntArray212 = new int[1];
        Interface.anIntArray245[0] = 2;
        Interface.anIntArray212[0] = requiredValues + 1;
        Interface.anIntArrayArray226 = new int[1][3];
        Interface.anIntArrayArray226[0][0] = 2;
        Interface.anIntArrayArray226[0][1] = 5;
        Interface.anIntArrayArray226[0][2] = 0;
    }
public static void addSprite(int ID, int i, String name) {
        Class9 Tab = addInterface(ID);
        Tab.anInt250 = ID;
        Tab.anInt236 = ID;
        Tab.anInt262 = 5;
        Tab.anInt217 = 0;
        Tab.anInt214 = 0;
        Tab.anInt220 = 512;
        Tab.anInt267 = 334;
        Tab.aByte254 = (byte) 0;
        Tab.anInt230 = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_207 = LoadSprite(i, name);
    }
    public static Class9 addTabInterface(int id) {
        Class9 i = aClass9Array210[id] = new Class9();
        i.anInt236 = id;
        i.anInt250 = id;
        i.anInt262 = 0;
        i.anInt217 = 0;
        i.anInt220 = 191;
        i.anInt267 = 261;
        i.anInt261 = 0;
        i.opacity = 0;
        return i;
    }

public static void addText8(int i, String s,int k, boolean l, boolean m, int a, Class30_Sub2_Sub1_Sub4[] TDA, int j) {
        Class9 rsinterface = addTabInterface(i);
        rsinterface.anInt236 = i;
        rsinterface.anInt250 = i;
        rsinterface.anInt262 = 4;
        rsinterface.anInt217 = 1;
        rsinterface.anInt220 = 174;
        rsinterface.anInt267 = 11;
        rsinterface.contentType = 0;
        rsinterface.aByte254 = 0;
        rsinterface.mOverInterToTrigger = a;
        rsinterface.centerText = l;
        rsinterface.textShadow = m;
        rsinterface.aClass30_Sub2_Sub1_Sub4_243 = TDA[j];
        rsinterface.aString248 = s;
        rsinterface.aString228 = "";
        rsinterface.anInt219 = 0;
        rsinterface.anInt232 = k;
        rsinterface.aString221 = s;
    }
public static void addTooltip(int id, String text, int H, int W) {
        Class9 rsi = addTabInterface(id);
        rsi.anInt250 = id;
        rsi.anInt262 = 0;
        rsi.isMouseoverTriggered = true;
        rsi.mOverInterToTrigger = -1;
        addTooltipBox(id + 1, text);
        rsi.totalChildren(1);
        rsi.child(0, id + 1, 0, 0);
        rsi.anInt267 = H;
        rsi.anInt220 = W;
    }

public static void addTooltipBox(int id, String text) {
        Class9 rsi = addInterface(id);
        rsi.anInt236 = id;
        rsi.anInt250 = id;
        rsi.anInt262 = 8;
        rsi.aString248 = text;
    }
 public static void AddInterfaceLabel(int id, String text, Class30_Sub2_Sub1_Sub4 wid[], int font, int color)
 {
	Class9 Tab = AddTab(id);
	Tab.anInt250 = id;
	Tab.anInt236 = id;
	Tab.anInt262 = 4;
	Tab.anInt217 = 0;
	Tab.anInt220 = 174;
	Tab.anInt267 = 11;
	Tab.anInt214 = 0;
	Tab.aByte254 = 0;
	Tab.anInt230 = -1;
	Tab.aBoolean223 = false;
	Tab.aBoolean268 = true;
	Tab.aClass30_Sub2_Sub1_Sub4_243 = wid[font];
	Tab.aString248 = text;
	Tab.aString228 = "";
	Tab.anInt232 = color;
	Tab.anInt219 = 0;
	Tab.anInt216 = 0;
	Tab.anInt239 = 0;	
}

public static void AddClickableText(int i, String text, String tooltip, Class30_Sub2_Sub1_Sub4 wid[], int font, int color, int width, int height)
{
	Class9 Tab = AddTab(i);
	Tab.anInt250 = i;
	Tab.anInt236 = i;
	Tab.anInt262 = 4;
	Tab.anInt217 = 1;
	Tab.anInt220 = width;
	Tab.anInt267 = height;
	Tab.anInt214 = 0;
	Tab.aByte254 = 0;
	Tab.anInt230 = -1;
	Tab.aBoolean223 = false;
	Tab.aBoolean268 = true;
	Tab.aClass30_Sub2_Sub1_Sub4_243 = wid[font];
	Tab.aString248 = text;
	Tab.aString221 = tooltip;
	Tab.aString228 = "";
	Tab.anInt232 = color;
	Tab.anInt219 = 0;
	Tab.anInt216 = 0;
	Tab.anInt239 = 0;	
}

public static void AddInterfaceModel(int ID, int mId, int modelZoom, int modelRT, int modelRT2)
{
	Class9 Tab = AddTab(ID);
	Tab.anInt250 = ID;
	Tab.anInt236 = ID;
	Tab.anInt262 = 6;
	Tab.anInt217 = 0;
	Tab.anInt233 = 1;
	Tab.anInt214 = 0;
	Tab.anInt220 = 512;
	Tab.anInt267 = 334;
	Tab.aByte254 = 0;
	Tab.anInt230 = -1;
	Tab.anInt234 = mId;
	Tab.anInt269 = modelZoom;
	Tab.anInt270 = modelRT;
	Tab.anInt271 = modelRT2;
}
	
public static Class9 AddTab(int id)
{
    Class9 Tab = aClass9Array210[id] = new Class9();
    Tab.anInt250 = id;//250
	Tab.anInt236 = id;//236
	Tab.anInt262 = 0;//262
	Tab.anInt217 = 0;//217
	Tab.anInt214 = 0;
	Tab.anInt220 = 512;//220
	Tab.anInt267 = 334;//anint267
	Tab.aByte254 = (byte)0;
	Tab.anInt230 = 0;
	return Tab;
}
public static void addCloseButton(int i)
	{
        Class9 Close = aClass9Array210[i] = new Class9();
    	Close.anInt250 = i;
        Close.anInt236 = i;
        Close.anInt262 = 5;
        Close.anInt217 = 6;
        Close.anInt214 = 0;
        Close.anInt220 = 21;
        Close.anInt267 = 21;
        Close.aByte254 = 0;
        Close.anInt230 = 52;
        Close.aClass30_Sub2_Sub1_Sub1_207 = loadAscheriitSprite(1, "death");
        Close.aClass30_Sub2_Sub1_Sub1_260 = loadAscheriitSprite(1, "death");
 	Close.aString221 = "Close Window";
	}
public static void addDSprite(int i, int j, int k)
	{
        Class9 dSprite = aClass9Array210[i] = new Class9();
        dSprite.anInt250 = i;
        dSprite.anInt236 = i;
        dSprite.anInt262 = 5;
        dSprite.anInt217 = 1;
        dSprite.anInt214 = 0;
        dSprite.anInt220 = 20;
        dSprite.anInt267 = 20;
        dSprite.aByte254 = 0;
        dSprite.anInt230 = 52;
        dSprite.aClass30_Sub2_Sub1_Sub1_207 = loadAscheriitSprite(j, "death");
        dSprite.aClass30_Sub2_Sub1_Sub1_260 = loadAscheriitSprite(k, "death");
	}
private static Class30_Sub2_Sub1_Sub1 BloodIsleSpriteLoader(int i, String s) 
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
 class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(signlink.findcachedir() +"/Sprites/Items_On_Death/").append(s).append(" ").append(i).append(".png").toString());
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}
private static Class30_Sub2_Sub1_Sub1 loadAscheriitSprite(int i, String s) 
{
long l = (Class50.method585((byte)1, s) << 8) + (long)i;
Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
if(class30_sub2_sub1_sub1 != null) {
return class30_sub2_sub1_sub1;
}
try {
 class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(signlink.findcachedir() +"/interface/").append(s).append(" ").append(i).append(".png").toString());
aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
} catch(Exception exception) {
return null;
}
return class30_sub2_sub1_sub1;
}	
public static Class9 AddDTab(int i)
{
	Class9 class9 = aClass9Array210[i] = new Class9();
	class9.anInt250 = i;
	class9.anInt236 = i;
	class9.anInt262 = 0;
	class9.anInt217 = 0;
	class9.anInt214 = 0;
	class9.anInt220 = 512;
	class9.anInt267 = 334;
	class9.aByte254 = 0;
	class9.anInt230 = 0;
	return class9;
}

public static void AddCharacter(int ID)
{ 
	Class9 class9 = aClass9Array210[ID] = new Class9();
	class9.anInt250 = ID;
	class9.anInt236 = ID;
	class9.anInt262 = 6;
	class9.anInt217 = 0;
	class9.anInt214 = 328;
	class9.anInt220 = 136;
	class9.anInt267 = 168;
	class9.aByte254 = 0;
	class9.anInt230 = 0;
	class9.anInt269 = 650;
	class9.anInt270 = 150;
	class9.anInt271 = 0;
	class9.anInt257 = -1;
	class9.anInt258 = -1;
}

public static void AddInventoryItemGroup(int id, int h, int w)
{
	Class9 Tab = aClass9Array210[id] = new Class9();
	Tab.anIntArray253 = new int[w * h];
	Tab.anIntArray252 = new int[w * h];
	for(int i1 = 0; i1 < w * h; i1++)
	{
		Tab.anIntArray252[i1] = 0; //inv item stack size
		Tab.anIntArray253[i1] = 0; //inv item ids
	}
	Tab.anIntArray247 = new int[20];
	Tab.anIntArray215 = new int[20];
	for(int i2 = 0; i2 < 20; i2++)
	{
		Tab.anIntArray247[i2] = 0;
		Tab.anIntArray215[i2] = 0;
	}

	Tab.anInt220 = w;
	Tab.anInt230 = -1;
	Tab.anInt236 = id;
	Tab.anInt250 = id;
	Tab.anInt261 = 0;
	Tab.anInt262 = 2;
	Tab.anInt267 = h;
}


public static void SetContextOptions(int ID, String[] options)
{
	if(aClass9Array210[ID] == null)
		return;
	String[] real = new String[5];
	for(int i = 0; i < 5; i++)
		real[i] = (i < options.length ? options[i] : null);
	aClass9Array210[ID].aStringArray225 = real;
}
public static Class9 addTabb(int id)
	{
    	Class9 class9 = aClass9Array210[id] = new Class9();
    	class9.anInt250 = id;//250
        class9.anInt236 = id;//236
        class9.anInt262 = 0;//262
        class9.anInt217 = 0;//217
        class9.anInt214 = 0;
        class9.anInt220 = 512;//220
        class9.anInt267 = 700;//anint267
        class9.aByte254 = (byte)0;
        class9.anInt230 = -1;//Int 230
        return class9;
	}
    private static Class30_Sub2_Sub1_Sub1 Run(int i, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(signlink.findcachedir() +"/Sprites/InterfaceSprites/").append(s).append(" ").append(i).append(".PNG").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }
public static void addSpellClick3(int i, int spriteOnId, int spriteOffId, String s)
    {


        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt220 = i;
        class9.anInt236 = i;
class9.anInt250 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
 class9.aClass30_Sub2_Sub1_Sub1_207 = pleasework(spriteOnId, "custom");
 class9.aClass30_Sub2_Sub1_Sub1_260 = pleasework(spriteOffId, "custom");       
class9.aString221 = s;
    }

public static void addSpellClick2(int id, int spriteOnId, int spriteOffId)
{
Class9 spell = aClass9Array210[id] = new Class9();
spell.anInt250 = id;
spell.anInt236 = id;
spell.anInt262 = 5;
spell.anInt217 = 1;
spell.anInt214 = 0;
spell.anInt220 = 2;
spell.anInt267 = 2;
spell.aByte254 = (byte)0;
spell.anInt230 = 52;
spell.aClass30_Sub2_Sub1_Sub1_207 = pleasework(spriteOnId, "custom");
spell.aClass30_Sub2_Sub1_Sub1_260 = pleasework(spriteOffId, "custom");        	
}

    public static Class30_Sub2_Sub1_Sub1 drawSprite(String s)
    {
        String s1 = signlink.findcachedir() +"/Sprites/InterfaceSprites/";
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1;
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(s1).append("").append(s).toString());
        }
        catch(Exception exception)
        {
            System.out.println("EXCEPTION!!!");
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    private static Class30_Sub2_Sub1_Sub1 pleasework(int i, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1((new StringBuilder()).append(signlink.findcachedir() +"/Sprites/InterfaceSprites/").append(s).append(" ").append(i).append(".png").toString());
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

	public static Class9 addTab(int id)
	{
    	Class9 Tab = aClass9Array210[id] = new Class9();
    	Tab.anInt250 = id;
        Tab.anInt236 = id;
        Tab.anInt262 = 0;
        Tab.anInt217 = 0;
        Tab.anInt214 = 0;
        Tab.anInt220 = 512;
        Tab.anInt267 = 334;
        Tab.aByte254 = (byte)0;
        Tab.anInt230 = 0;
        return Tab;
	}


public static void addCastOn(int id, int spriteOnId, int spriteOffId, String spellName, int l)//the int l is what is explained below
{
            Class9 spell = aClass9Array210[id] = new Class9();
            spell.anInt250 = id;//250
            spell.anInt236 = id;//236
            spell.anInt262 = 5;//262
            spell.anInt217 = 2;//217
                spell.anInt214 = 0;
                spell.anInt220 = 20;//220
                spell.anInt267 = 20;//anint267
            spell.aByte254 = (byte)0;
            spell.anInt230 = 52;
               spell.aClass30_Sub2_Sub1_Sub1_207 = SpriteLoader(spriteOnId, "Custom");
        spell.aClass30_Sub2_Sub1_Sub1_260 = SpriteLoader(spriteOffId, "Custom");
               spell.aString222 = "@whi@Cast ->";
        spell.aString218 = spellName;        
        spell.anInt237 = l; // this is what you will use to choose what your casting the spell on monster player object item what ever
    }
public static Class30_Sub2_Sub1_Sub4[] fonts;

	public static Class9 addInterface(int id) {
		Class9 ui = aClass9Array210[id] = new Class9();
		ui.anInt250 = id;
		ui.anInt236 = id;
		ui.anInt262 = 0;
		ui.anInt217 = 0;
		ui.anInt214 = 0;
		ui.anInt220 = 512;
		ui.anInt267 = 334;
		ui.aByte254 = (byte) 0;
		return ui;
	}

	public static void skillTab602() {
		Class9 skill = addInterface(3917);
		String[] spriteNames = { "Attack", "HP", "Mine", "Strength", "Agility", "Smith", "Defence", "Herblore", "Fish", "Range", "Thief", "Cook", "Prayer", "Craft", "Fire", "Mage", "Fletch", "Wood", "Rune", "Slay", "Farm", "Construction", "Hunter", "Summon", "Dungeon" };
		int[] buttons = { 8654, 8655, 8656, 8657, 8658, 8659, 8660, 8861, 8662, 8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 12162, 13928, 18177, 18178, 18179, 18180 };
		int[] hovers = { 4040, 4076, 4112, 4046, 4082, 4118, 4052, 4088, 4124, 4058, 4094, 4130, 4064, 4100, 4136, 4070, 4106, 4142, 4160, 2832, 13917, 18173, 18174, 18175, 18176 };
		int[][] text = { { 4004, 4005 }, { 4016, 4017 }, { 4028, 4029 },
				{ 4006, 4007 }, { 4018, 4019 }, { 4030, 4031 }, { 4008, 4009 },
				{ 4020, 4021 }, { 4032, 4033 }, { 4010, 4011 }, { 4022, 4023 },
				{ 4034, 4035 }, { 4012, 4013 }, { 4024, 4025 }, { 4036, 4037 },
				{ 4014, 4015 }, { 4026, 4027 }, { 4038, 4039 }, { 4152, 4153 },
				{ 12166, 12167 }, { 13926, 13927 }, { 18165, 18169 },
				{ 18166, 18170 }, { 18167, 18171 }, { 18168, 18172 } };

		int[] icons = { 3965, 3966, 3967, 3968, 3969, 3970, 3971, 3972, 3973,
				3974, 3975, 3976, 3977, 3978, 3979, 3980, 3981, 3982, 4151,
				12165, 13925, 18181, 18182, 18183, 18184 };

		int[][] buttonCoords = { { 4, 4 }, { 66, 4 }, { 128, 4 }, { 4, 32 },
				{ 66, 32 }, { 128, 32 }, { 4, 60 }, { 66, 60 }, { 128, 60 },
				{ 4, 88 }, { 66, 88 }, { 128, 88 }, { 4, 116 }, { 66, 116 },
				{ 128, 116 }, { 4, 144 }, { 66, 144 }, { 128, 144 },
				{ 4, 172 }, { 66, 172 }, { 128, 172 }, { 4, 200 }, { 66, 200 },
				{ 128, 200 }, { 4, 229 } };
		int[][] iconCoords = { { 6, 6 }, { 69, 7 }, { 131, 6 }, { 9, 34 },
				{ 68, 33 }, { 131, 36 }, { 9, 64 }, { 67, 63 }, { 131, 61 },
				{ 7, 91 }, { 68, 94 }, { 133, 90 }, { 6, 118 }, { 70, 120 },
				{ 130, 118 }, { 6, 147 }, { 69, 146 }, { 132, 146 },
				{ 6, 173 }, { 69, 173 }, { 130, 174 }, { 6, 202 }, { 69, 201 },
				{ 131, 202 }, { 6, 230 } };
		int[][] textCoords = { { 31, 7, 44, 18 }, { 93, 7, 106, 18 },
				{ 155, 7, 168, 18 }, { 31, 35, 44, 46 }, { 93, 35, 106, 46 },
				{ 155, 35, 168, 46 }, { 31, 63, 44, 74 }, { 93, 63, 106, 74 },
				{ 155, 63, 168, 74 }, { 31, 91, 44, 102 },
				{ 93, 91, 106, 102 }, { 155, 91, 168, 102 },
				{ 31, 119, 44, 130 }, { 93, 119, 106, 130 },
				{ 155, 119, 168, 130 }, { 31, 149, 44, 158 },
				{ 93, 147, 106, 158 }, { 155, 147, 168, 158 },
				{ 31, 175, 44, 186 }, { 93, 175, 106, 186 },
				{ 155, 175, 168, 186 }, { 31, 203, 44, 214 },
				{ 93, 203, 106, 214 }, { 155, 203, 168, 214 },
				{ 31, 231, 44, 242 } };
		int[][] newText = { { 18165, 18166, 18167, 18168 },
				{ 18169, 18170, 18171, 18172 } };
		for (int i = 0; i < hovers.length; i++) {
			createSkillHover(hovers[i], 205 + i);
			addSkillButton(buttons[i]);
			addImage(icons[i], spriteNames[i]);
		}
		for (int i = 0; i < 4; i++) {
			addSkillText(newText[0][i], false, i + 21);
			addSkillText(newText[1][i], true, i + 21);
		}
		skill.children(icons.length + (text.length * 2) + hovers.length + buttons.length + 1);
		int frame = 0;
		Class9 totalLevel = aClass9Array210[3984];
		totalLevel.aString248 = "Total level: %1";
		totalLevel.aClass30_Sub2_Sub1_Sub4_243 = fonts[2];
		skill.child(frame, 3984, 74, 237); frame++;
		for (int i = 0; i < buttons.length; i++) {
			skill.child(frame, buttons[i], buttonCoords[i][0], buttonCoords[i][1]); frame++;
		}
		for (int i = 0; i < icons.length; i++) {
			skill.child(frame, icons[i], iconCoords[i][0], iconCoords[i][1]); frame++;
		}
		for (int i = 0; i < text.length; i++) {
			skill.child(frame, text[i][0], textCoords[i][0], textCoords[i][1]); frame++;
		}
		for (int i = 0; i < text.length; i++) {
			skill.child(frame, text[i][1], textCoords[i][2], textCoords[i][3]); frame++;
		}
		for (int i = 0; i < hovers.length; i++) {
			skill.child(frame, hovers[i], buttonCoords[i][0], buttonCoords[i][1]); frame++;
		}
	}

	public void children(int total) {
		anIntArray240 = new int[total];
		anIntArray241 = new int[total];
		anIntArray272 = new int[total];
	}

	public void child(int index, int id, int x, int y) {
		anIntArray240[index] = id;
		anIntArray241[index] = x;
		anIntArray272[index] = y;
	}

	public static void createSkillHover(int id, int x) {
		Class9 hover = addInterface(id);
		hover.anInt262 = 9;
		hover.aString248 = "TESTING!";
		hover.anInt214 = x;
		hover.anInt220 = 60;
		hover.anInt267 = 28;
		hover.inventoryHover = true;
	}

	public static void addSkillText(int id, boolean max, int skill) {
		Class9 text = addInterface(id);
		text.anInt250 = id;
		text.anInt236 = id;
		text.anInt262 = 4;
		text.anInt217 = 0;
		text.anInt220 = 15;
		text.anInt267 = 12;
		text.aClass30_Sub2_Sub1_Sub4_243 = fonts[0];
		text.aBoolean268 = true;
		text.aBoolean223 = true;
		text.anInt232 = 16776960;
		if (!max) {
			text.anIntArrayArray226 = new int[1][];
			text.anIntArrayArray226[0] = new int[3];
			text.anIntArrayArray226[0][0] = 1;
			text.anIntArrayArray226[0][1] = skill;
			text.anIntArrayArray226[0][2] = 0;
		} else {
			text.anIntArrayArray226 = new int[2][];
			text.anIntArrayArray226[0] = new int[3];
			text.anIntArrayArray226[0][0] = 1;
			text.anIntArrayArray226[0][1] = skill;
			text.anIntArrayArray226[0][2] = 0;
			text.anIntArrayArray226[1] = new int[1];
			text.anIntArrayArray226[1][0] = 0;
		}
		text.aString248 = "%1";
	}

	public static void addSkillButton(int id) {
		Class9 button = addInterface(id);
		button.anInt262 = 5;
		button.anInt217 = 5;
		button.anInt214 = 0;
		button.anInt220 = 60;
		button.anInt267 = 27;
		button.aClass30_Sub2_Sub1_Sub1_207 = getSprite("Button");
		button.aString221 = "View";
	}

	public static void addImage(int id, String s) {
		Class9 image = addInterface(id);
		image.anInt262 = 5;
		image.anInt217 = 0;
		image.anInt214 = 0;
		image.anInt220 = 100;
		image.anInt267 = 100;
		image.aClass30_Sub2_Sub1_Sub1_207 = getSprite(s);
	}

	public static Class30_Sub2_Sub1_Sub1 getSprite(String s) {
		Class30_Sub2_Sub1_Sub1 image;
		try {
			image = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"Sprites/"+s+".png");
			if (image != null) {
				return image;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return image;
	}
public boolean inventoryHover;

public void specialBar(int id) //7599
    {
        /*addActionButton(ID, SpriteOFF, SpriteON, Width, Height, "SpriteText");*/
            addSpecButton(id-12, 7587, -1, 150, 26, "Use @gre@Special Attack");
        /*removeSomething(ID);*/
        for (int i = id-11; i < id; i++)
            removeSomething(i);

        Class9 class9 = aClass9Array210[id-12];
            class9.anInt220 = 150;
            class9.anInt267 = 26;

        class9 = aClass9Array210[id];
            class9.anInt220 = 150;
            class9.anInt267 = 26;

            class9.child(0, id-12, 0, 0);

            class9.child(12, id+1, 3, 7);

            class9.child(23, id+12, 16, 8);

        for (int i = 13; i < 23; i++) {
            class9.anIntArray272[i] -= 1;
        }

        class9 = aClass9Array210[id+1];
            class9.anInt262 = 5;
            class9.aClass30_Sub2_Sub1_Sub1_207 = CustomWepLoader(7600, "");

        for (int i = id+2; i < id+12; i++) {
        class9 = aClass9Array210[i];
            class9.anInt262 = 5;
        }

        sprite1(id+2, 7601);sprite1(id+3, 7602);
        sprite1(id+4, 7603);sprite1(id+5, 7604);
        sprite1(id+6, 7605);sprite1(id+7, 7606);
        sprite1(id+8, 7607);sprite1(id+9, 7608);
        sprite1(id+10, 7609);sprite1(id+11, 7610);
    }

    public static void Sidebar0(Class30_Sub2_Sub1_Sub4[] wid)
    {
        /*Sidebar0a(id, id2, id3, "text1", "text2", "text3", "text4", str1x, str1y, str2x, str2y, str3x, str3y, str4x, str4y, img1x, img1y, img2x, img2y, img3x, img3y, img4x, img4y, wid);*/
            Sidebar0a(1698, 1701, 7499, "Chop", "Hack", "Smash", "Block", 42, 75, 127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0a(2276, 2279, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75, 124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0a(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0a(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39, 75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0a(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75, 124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0a(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75, 125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0a(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41, 75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0a(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, wid);
        /*Sidebar0b(id, id2, "text1", "text2", "text3", "text4", str1x, str1y, str2x, str2y, str3x, str3y, str4x, str4y, img1x, img1y, img2x, img2y, img3x, img3y, img4x, img4y, wid);*/
            Sidebar0b(776, 779, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75, 46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50, wid);
        /*Sidebar0c(id, id2, id3, "text1", "text2", "text3", str1x, str1y, str2x, str2y, str3x, str3y, img1x, img1y, img2x, img2y, img3x, img3y, wid);*/
            Sidebar0c(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75, 42, 128, 40, 103, 40, 50, 122, 50, wid);
            Sidebar0c(1749, 1752, 7524, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, wid);
            Sidebar0c(1764, 1767, 7549, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, wid);
            Sidebar0c(4446, 4449, 7649, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, wid);
            Sidebar0c(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75, 42, 128, 40, 50, 122, 50, 40, 103, wid);
            Sidebar0c(6103, 6132, 6117, "Bash", "Pound", "Block", 43, 75, 124, 75, 42, 128, 40, 103, 40, 50, 122, 50, wid);
            Sidebar0c(8460, 8463, 8493, "Jab", "Swipe", "Fend", 46, 75, 124, 75, 43, 128, 40, 103, 40, 50, 122, 50, wid);
            Sidebar0c(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127, 75, 36, 128, 40, 50, 40, 103, 122, 50, wid);
        /*Sidebar0d(id, id2, "text1", "text2", "text3", str1x, str1y, str2x, str2y, str3x, str3y, img1x, img1y, img2x, img2y, img3x, img3y, wid);*/
            Sidebar0d(328, 331, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136, 40, 120, 40, 50, 40, 85, wid);

        Class9 class9 = addInterface(19300);
        /*textSize(ID, wid, Size);*/
            textSize(3983, wid, 0);
        /*addToggleButton(id, sprite, config, width, height, wid);*/
            addToggleButton(150, 150, 172, 150, 44, "Auto Retaliate");

        class9.totalChildren(2, 2, 2);
            class9.child(0, 3983, 52, 25); //combat level
            class9.child(1, 150, 21, 153); //auto retaliate

        class9 = aClass9Array210[3983];
            class9.aBoolean223 = true;
            class9.anInt232 = 0xff981f;
    }

    public static void Sidebar0a(int id, int id2, int id3, String text1, String text2, String text3, String text4,
                                               int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y,
                                               int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, Class30_Sub2_Sub1_Sub4[] wid) //4button spec
    {
        Class9 class9 = addInterface(id); //2423
        /*addText(ID, "Text", wid, Size, Colour, Centered);*/
            addText(id2, "-2", wid, 3, 0xff981f, true); //2426
            addText(id2+11, text1, wid, 0, 0xff981f, false);
            addText(id2+12, text2, wid, 0, 0xff981f, false);
            addText(id2+13, text3, wid, 0, 0xff981f, false);
            addText(id2+14, text4, wid, 0, 0xff981f, false);
        /*specialBar(ID);*/
            class9.specialBar(id3); //7599

            class9.anInt220 = 190;
            class9.anInt267 = 261;

        int last = 15; int frame = 0;
        class9.totalChildren(last, last, last);

            class9.child(frame, id2+3, 21, 46); frame++; //2429
            class9.child(frame, id2+4, 104, 99); frame++; //2430
            class9.child(frame, id2+5, 21, 99); frame++; //2431
            class9.child(frame, id2+6, 105, 46); frame++; //2432

            class9.child(frame, id2+7, img1x, img1y); frame++; //bottomright 2433
            class9.child(frame, id2+8, img2x, img2y); frame++; //topleft 2434
            class9.child(frame, id2+9, img3x, img3y); frame++; //bottomleft 2435
            class9.child(frame, id2+10, img4x, img4y); frame++; //topright 2436

            class9.child(frame, id2+11, str1x, str1y); frame++; //chop 2437
            class9.child(frame, id2+12, str2x, str2y); frame++; //slash 2438
            class9.child(frame, id2+13, str3x, str3y); frame++; //lunge 2439
            class9.child(frame, id2+14, str4x, str4y); frame++; //block 2440

            class9.child(frame, 19300, 0, 0); frame++; //stuffs
            class9.child(frame, id2, 94, 4); frame++; //weapon 2426
            class9.child(frame, id3, 21, 205); frame++; //special attack 7599

        for (int i = id2+3; i < id2+7; i++) { //2429 - 2433
        class9 = aClass9Array210[i];
            class9.aClass30_Sub2_Sub1_Sub1_207 = CustomWepLoader(19301, ""); class9.aClass30_Sub2_Sub1_Sub1_260 = CustomWepLoader(19301, "a");
            class9.anInt220 = 68; class9.anInt267 = 44;
        }
    }


    public static void Sidebar0b(int id, int id2, String text1, String text2, String text3, String text4,
                                               int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y,
                                               int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, Class30_Sub2_Sub1_Sub4[] wid) //4button nospec
    {
        Class9 class9 = addInterface(id); //2423
        /*addText(ID, "Text", wid, Size, Colour, Centered);*/
            addText(id2, "-2", wid, 3, 0xff981f, true); //2426
            addText(id2+11, text1, wid, 0, 0xff981f, false);
            addText(id2+12, text2, wid, 0, 0xff981f, false);
            addText(id2+13, text3, wid, 0, 0xff981f, false);
            addText(id2+14, text4, wid, 0, 0xff981f, false);

            class9.anInt220 = 190;
            class9.anInt267 = 261;

        int last = 14; int frame = 0;
        class9.totalChildren(last, last, last);

            class9.child(frame, id2+3, 21, 46); frame++; //2429
            class9.child(frame, id2+4, 104, 99); frame++; //2430
            class9.child(frame, id2+5, 21, 99); frame++; //2431
            class9.child(frame, id2+6, 105, 46); frame++; //2432

            class9.child(frame, id2+7, img1x, img1y); frame++; //bottomright 2433
            class9.child(frame, id2+8, img2x, img2y); frame++; //topleft 2434
            class9.child(frame, id2+9, img3x, img3y); frame++; //bottomleft 2435
            class9.child(frame, id2+10, img4x, img4y); frame++; //topright 2436

            class9.child(frame, id2+11, str1x, str1y); frame++; //chop 2437
            class9.child(frame, id2+12, str2x, str2y); frame++; //slash 2438
            class9.child(frame, id2+13, str3x, str3y); frame++; //lunge 2439
            class9.child(frame, id2+14, str4x, str4y); frame++; //block 2440

            class9.child(frame, 19300, 0, 0); frame++; //stuffs
            class9.child(frame, id2, 94, 4); frame++; //weapon 2426

        for (int i = id2+3; i < id2+7; i++) { //2429 - 2433
        class9 = aClass9Array210[i];
            class9.aClass30_Sub2_Sub1_Sub1_207 = CustomWepLoader(19301, ""); class9.aClass30_Sub2_Sub1_Sub1_260 = CustomWepLoader(19301, "a");
            class9.anInt220 = 68; class9.anInt267 = 44;
        }
    }

    public static void Sidebar0c(int id, int id2, int id3, String text1, String text2, String text3,
                                               int str1x, int str1y, int str2x, int str2y, int str3x, int str3y,
                                               int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, Class30_Sub2_Sub1_Sub4[] wid) //3button spec
    {
        Class9 class9 = addInterface(id); //2423
        /*addText(ID, "Text", wid, Size, Colour, Centered);*/
            addText(id2, "-2", wid, 3, 0xff981f, true); //2426
            addText(id2+9, text1, wid, 0, 0xff981f, false);
            addText(id2+10, text2, wid, 0, 0xff981f, false);
            addText(id2+11, text3, wid, 0, 0xff981f, false);
        /*specialBar(ID);*/
            class9.specialBar(id3); //7599

            class9.anInt220 = 190;
            class9.anInt267 = 261;

        int last = 12; int frame = 0;
        class9.totalChildren(last, last, last);

            class9.child(frame, id2+3, 21, 99); frame++;
            class9.child(frame, id2+4, 105, 46); frame++;
            class9.child(frame, id2+5, 21, 46); frame++;

            class9.child(frame, id2+6, img1x, img1y); frame++; //topleft
            class9.child(frame, id2+7, img2x, img2y); frame++; //bottomleft
            class9.child(frame, id2+8, img3x, img3y); frame++; //topright

            class9.child(frame, id2+9, str1x, str1y); frame++; //chop
            class9.child(frame, id2+10, str2x, str2y); frame++; //slash
            class9.child(frame, id2+11, str3x, str3y); frame++; //lunge

            class9.child(frame, 19300, 0, 0); frame++; //stuffs
            class9.child(frame, id2, 94, 4); frame++; //weapon
            class9.child(frame, id3, 21, 205); frame++; //special attack 7599

        for (int i = id2+3; i < id2+6; i++) {
        class9 = aClass9Array210[i];
            class9.aClass30_Sub2_Sub1_Sub1_207 = CustomWepLoader(19301, ""); class9.aClass30_Sub2_Sub1_Sub1_260 = CustomWepLoader(19301, "a");
            class9.anInt220 = 68; class9.anInt267 = 44;
        }
    }

    public static void Sidebar0d(int id, int id2, String text1, String text2, String text3,
                                               int str1x, int str1y, int str2x, int str2y, int str3x, int str3y,
                                               int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, Class30_Sub2_Sub1_Sub4[] wid) //3button nospec (magic intf)
    {
        Class9 class9 = addInterface(id); //2423
        /*addText(ID, "Text", wid, Size, Colour, Centered);*/
            addText(id2, "-2", wid, 3, 0xff981f, true); //2426
            addText(id2+9, text1, wid, 0, 0xff981f, false);
            addText(id2+10, text2, wid, 0, 0xff981f, false);
            addText(id2+11, text3, wid, 0, 0xff981f, false);

            addText(353, "Spell", wid, 0, 0xff981f, false);
            addText(354, "Spell", wid, 0, 0xff981f, false);

            addCacheSprite(337, 19, 0, "combaticons");
            addCacheSprite(338, 13, 0, "combaticons2");
            addCacheSprite(339, 14, 0, "combaticons2");

        /*addToggleButton(id, sprite, config, width, height, tooltip);*/
            addToggleButton(349, 349, 108, 68, 44, "Select");
            addToggleButton(350, 350, 108, 68, 44, "Select");

            class9.anInt220 = 190;
            class9.anInt267 = 261;

        int last = 15; int frame = 0;
        class9.totalChildren(last, last, last);

            class9.child(frame, id2+3, 20, 115); frame++;
            class9.child(frame, id2+4, 20, 80); frame++;
            class9.child(frame, id2+5, 20, 45); frame++;

            class9.child(frame, id2+6, img1x, img1y); frame++; //topleft
            class9.child(frame, id2+7, img2x, img2y); frame++; //bottomleft
            class9.child(frame, id2+8, img3x, img3y); frame++; //topright

            class9.child(frame, id2+9, str1x, str1y); frame++; //bash
            class9.child(frame, id2+10, str2x, str2y); frame++; //pound
            class9.child(frame, id2+11, str3x, str3y); frame++; //focus

            class9.child(frame, 349, 105, 46); frame++; //spell1
            class9.child(frame, 350, 104, 106); frame++; //spell2

            class9.child(frame, 353, 125, 74); frame++; //spell
            class9.child(frame, 354, 125, 134); frame++; //spell

            class9.child(frame, 19300, 0, 0); frame++; //stuffs
            class9.child(frame, id2, 94, 4); frame++; //weapon
    }
public static void itemsOnDeath(Class30_Sub2_Sub1_Sub4[] wid)
    {
        Class9 death = addDTab(18100);
        addDSprite(18101, 2, 2);
        addCloseButton(18102);
        addText(18103, "", wid, 2, 0xff981f);
        addText(18104, "", wid, 1, 0xff981f);
        addText(18105, "", wid, 1, 0xff981f);
        addText(18106, "", wid, 1, 0xff981f);
        addText(18107, "", wid, 1, 0xffcc33);
        addText(18108, "", wid, 1, 0xffcc33);
        death.anInt261 = 0;
        death.aBoolean266 = false;
        death.anIntArray240 = new int[11];
        death.anIntArray241 = new int[11];
        death.anIntArray272 = new int[11];
        death.anIntArray240[0] = 18101;
        death.anIntArray241[0] = 7;
        death.anIntArray272[0] = 8;
        death.anIntArray240[1] = 18102;
        death.anIntArray241[1] = 480;
        death.anIntArray272[1] = 17;        
        death.anIntArray240[2] = 18103;
        death.anIntArray241[2] = 185;
        death.anIntArray272[2] = 18;
        death.anIntArray240[3] = 18104;
        death.anIntArray241[3] = 22;
        death.anIntArray272[3] = 50;
        death.anIntArray240[4] = 18105;
        death.anIntArray241[4] = 22;
        death.anIntArray272[4] = 110;
        death.anIntArray240[5] = 18106;
        death.anIntArray241[5] = 347;
        death.anIntArray272[5] = 47;
        death.anIntArray240[6] = 18107;
        death.anIntArray241[6] = 349;
        death.anIntArray272[6] = 270;
        death.anIntArray240[7] = 18108;
        death.anIntArray241[7] = 398;
        death.anIntArray272[7] = 298;
        death.anIntArray240[8] = 18115;
        death.anIntArray241[8] = 348;
        death.anIntArray272[8] = 64;
        death.anIntArray240[9] = 10494;
        death.anIntArray241[9] = 26;
        death.anIntArray272[9] = 74;
        death.anIntArray240[10] = 10600;
        death.anIntArray241[10] = 26;
        death.anIntArray272[10] = 133;
    }
    public static void itemsOnDeathDATA(Class30_Sub2_Sub1_Sub4[] wid)
    {
        Class9 death = addDTab(18115);
        addText(18109, "", wid, 0, 0xff981f);
        addText(18110, "", wid, 0, 0xff981f);
        addText(18111, "", wid, 0, 0xff981f);
        addText(18112, "", wid, 0, 0xff981f);
        addText(18113, "", wid, 0, 0xff981f);
        addText(18114, "", wid, 0, 0xff981f);
        addText(18117, "", wid, 0, 0xff981f);
        addText(18118, "", wid, 0, 0xff981f);
        addText(18119, "", wid, 0, 0xff981f);
        addText(18120, "", wid, 0, 0xff981f);
        addText(18121, "", wid, 0, 0xff981f);
        addText(18122, "", wid, 0, 0xff981f);
        addText(18123, "", wid, 0, 0xff981f);
        addText(18124, "", wid, 0, 0xff981f);
        addText(18125, "", wid, 0, 0xff981f);
        addText(18126, "", wid, 0, 0xff981f);
        addText(18127, "", wid, 0, 0xff981f);
        addText(18128, "", wid, 0, 0xff981f);
        addText(18129, "", wid, 0, 0xff981f);
        addText(18130, "", wid, 0, 0xff981f);
        death.anInt236 = 18115;
        death.anInt250 = 18115;
        death.anInt262 = 0;
        death.anInt217 = 0;
        death.anInt214 = 0;
        death.anInt220 = 130;
        death.anInt267 = 197;
        death.aByte254 = 0;
        death.anInt230 = -1;
        death.anInt261 = 280;
        death.anIntArray240 = new int[20];
        death.anIntArray241 = new int[20];
        death.anIntArray272 = new int[20];
        death.anIntArray240[0] = 18109;
        death.anIntArray241[0] = 0;
        death.anIntArray272[0] = 0;
        death.anIntArray240[1] = 18110;
        death.anIntArray241[1] = 0;
        death.anIntArray272[1] = 12;
        death.anIntArray240[2] = 18111;
        death.anIntArray241[2] = 0;
        death.anIntArray272[2] = 24;
        death.anIntArray240[3] = 18112;
        death.anIntArray241[3] = 0;
        death.anIntArray272[3] = 36;
        death.anIntArray240[4] = 18113;
        death.anIntArray241[4] = 0;
        death.anIntArray272[4] = 48;
        death.anIntArray240[5] = 18114;
        death.anIntArray241[5] = 0;
        death.anIntArray272[5] = 60;
        death.anIntArray240[6] = 18117;
        death.anIntArray241[6] = 0;
        death.anIntArray272[6] = 72;
        death.anIntArray240[7] = 18118;
        death.anIntArray241[7] = 0;
        death.anIntArray272[7] = 84;
        death.anIntArray240[8] = 18119;
        death.anIntArray241[8] = 0;
        death.anIntArray272[8] = 96;
        death.anIntArray240[9] = 18120;
        death.anIntArray241[9] = 0;
        death.anIntArray272[9] = 108;
        death.anIntArray240[10] = 18121;
        death.anIntArray241[10] = 0;
        death.anIntArray272[10] = 120;
        death.anIntArray240[11] = 18122;
        death.anIntArray241[11] = 0;
        death.anIntArray272[11] = 132;
        death.anIntArray240[12] = 18123;
        death.anIntArray241[12] = 0;
        death.anIntArray272[12] = 144;
        death.anIntArray240[13] = 18124;
        death.anIntArray241[13] = 0;
        death.anIntArray272[13] = 156;
        death.anIntArray240[14] = 18125;
        death.anIntArray241[14] = 0;
        death.anIntArray272[14] = 168;
        death.anIntArray240[15] = 18126;
        death.anIntArray241[15] = 0;
        death.anIntArray272[15] = 180;
        death.anIntArray240[16] = 18127;
        death.anIntArray241[16] = 0;
        death.anIntArray272[16] = 192;
        death.anIntArray240[17] = 18128;
        death.anIntArray241[17] = 0;
        death.anIntArray272[17] = 204;
        death.anIntArray240[18] = 18129;
        death.anIntArray241[18] = 0;
        death.anIntArray272[18] = 216;
        death.anIntArray240[19] = 18130;
        death.anIntArray241[19] = 0;
        death.anIntArray272[19] = 228;
}
public static void harrysoptiontab(Class44 sl, Class30_Sub2_Sub1_Sub4 tda[])
{
        String s1 = "";
        int i1 = 0;

Class9 Tab = addTab(19120);
Tab.anInt236 = 5608;
Tab.anInt250 = 19120;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 500;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,100";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19121);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19121;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19122, 98, 98);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19122;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19123);
Tab.anInt236 = 5608;
Tab.anInt250 = 19123;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19121;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,99";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,99";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));

Tab = addTab(19124);
Tab.anInt236 = 5608;
Tab.anInt250 = 19124;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 501;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,101";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19125);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19125;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19126, 103, 103);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19126;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19127);
Tab.anInt236 = 5608;
Tab.anInt250 = 19127;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19125;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,102";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,102";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));




Tab = addTab(19128);
Tab.anInt236 = 5608;
Tab.anInt250 = 19128;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 502;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,104";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19129);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19129;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19130, 106, 106);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19130;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19131);
Tab.anInt236 = 5608;
Tab.anInt250 = 19131;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19129;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,105";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,105";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));


Tab = addTab(19132);
Tab.anInt236 = 5608;
Tab.anInt250 = 19132;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 503;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,107";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19133);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19133;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19134, 109, 109);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19134;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19135);
Tab.anInt236 = 5608;
Tab.anInt250 = 19135;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19133;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,108";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,108";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));



Tab = addTab(19136);
Tab.anInt236 = 5608;
Tab.anInt250 = 19136;
Tab.anInt262 = 5;
Tab.anInt217 = 4;
Tab.anInt214 = 0;
Tab.anInt220 = 34;
Tab.anInt267 = 34;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 1;
Tab.anIntArray212[0] = 1;
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 5;
Tab.anIntArrayArray226[0][1] = 504;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,26";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Toggle";



Tab = addTab(19137);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19137;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19138, 110, 110);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19138;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19139);
Tab.anInt236 = 5608;
Tab.anInt250 = 19139;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19137;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,27";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,27";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));

Tab = addTab(19140);//Discription Box
Tab.anInt236 = 5608;//Parent ID
Tab.anInt250 = 19140;//Child ID
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt220 = 300;//disctription box width
Tab.anInt267 = 300;//discription box height
Tab.aBoolean266 = true;
Tab.anInt214 = 0;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 0;
addSpellClick2(19141, 112, 112);
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19141;//Discription Box sprite
Tab.anIntArray241[0] = 0;//Width
Tab.anIntArray272[0] = 0;//height




Tab = addTab(19142);
Tab.anInt236 = 5608;
Tab.anInt250 = 19142;
Tab.anInt262 = 5;//type
Tab.anInt217 = 1;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = 19140;//discription box id
Tab.aString221 = "Toggle";
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "CUSTOM,111";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "CUSTOM,111";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));

Tab = addTab(19101);
Tab.anInt236 = 19100;
Tab.anInt250 = 19101;
Tab.anInt262 = 0;
Tab.anInt217 = 0;
Tab.anInt214 = 0;
Tab.anInt220 = 169;
Tab.anInt267 = 260;
Tab.aByte254 = 0;
Tab.anInt230 = -1;
Tab.anInt261 = 450;
Tab.aBoolean266 = false;//boolean
Tab.anIntArray240 = new int[1];
Tab.anIntArray241 = new int[1];
Tab.anIntArray272 = new int[1];
Tab.anIntArray240[0] = 19000;
Tab.anIntArray241[0] = 0;
Tab.anIntArray272[0] = 0;


Tab = addTab(19145);

        Tab.anInt236 = 5608;
        Tab.anInt250 = 19145;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 505;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19146);
Tab.anInt236 = 5608;
Tab.anInt250 = 19146;
Tab.anInt262 = 5;//type
Tab.anInt217 = 0;//atActionType
Tab.anInt220 = 54;//width
Tab.anInt267 = 33;//height
Tab.anInt230 = -1;//discription box id
Tab.anIntArray245 = new int[1];
Tab.anIntArray212 = new int[1];
Tab.anIntArray245[0] = 3;
Tab.anIntArray212[0] = 0;//level
Tab.anIntArrayArray226 = new int[1][3];
Tab.anIntArrayArray226[0][0] = 2;
Tab.anIntArrayArray226[0][1] = 5;
Tab.anIntArrayArray226[0][2] = 0;
s1 = "MISCGRAPHICS3,0";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_207 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
s1 = "MISCGRAPHICS3,0";
i1 = s1.lastIndexOf(",");
Tab.aClass30_Sub2_Sub1_Sub1_260 = customsprite(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
Tab = addTab(19147);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19147;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 506;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19148);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19148;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 507;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19149);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19149;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 508;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19150);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19150;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 509;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19151);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19151;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 510;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19152);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19152;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 511;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
        Tab.aString221 = "Select";
Tab = addTab(19153);
        Tab.anInt236 = 5608;
        Tab.anInt250 = 19153;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 34;
        Tab.anInt267 = 34;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = 512;
        Tab.anIntArrayArray226[0][2] = 0;
        s1 = "MISCGRAPHICS3,1";
        i1 = s1.lastIndexOf(",");
        Tab.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s1.substring(i1 + 1)), false, aClass44, s1.substring(0, i1));
        Tab.aClass30_Sub2_Sub1_Sub4_243 = tda[1];
Tab.aString221 = "Select";


Tab = addTab(19029);
addSpellClick2(19143, 113, 113);
addSpellClick2(19144, 114, 114);
addSpellClick2(19023, 21, 21);
addSpellClick2(19024, 22, 22);
addSpellClick2(19025, 23, 23);
addSpellClick2(19026, 24, 24);
addSpellClick2(19027, 25, 25);
addSpellClick2(19028, 28, 28);
Tab.anInt261 = 0;
Tab.aBoolean266 = false;
Tab.anIntArray240 = new int[66]; //Interface id
Tab.anIntArray241 = new int[66]; //X pos
Tab.anIntArray272 = new int[66]; //Y pos
Tab.anIntArray240[0] = 19123; //sprite
Tab.anIntArray241[0] = 13; //width
Tab.anIntArray272[0] = 152; //height
Tab.anIntArray240[1] = 19120; //select
Tab.anIntArray241[1] = 13; //width
Tab.anIntArray272[1] = 152; //height
Tab.anIntArray240[2] = 19127; //sprite
Tab.anIntArray241[2] = 69; //width
Tab.anIntArray272[2] = 152; //height
Tab.anIntArray240[3] = 19124; //select
Tab.anIntArray241[3] = 69; //width
Tab.anIntArray272[3] = 152; //height
Tab.anIntArray240[4] = 19131; //sprite
Tab.anIntArray241[4] = 125; //width
Tab.anIntArray272[4] = 152; //height
Tab.anIntArray240[5] = 19128; //select
Tab.anIntArray241[5] = 125; //width
Tab.anIntArray272[5] = 152; //height
Tab.anIntArray240[6] = 19135; //sprite
Tab.anIntArray241[6] = 13; //width
Tab.anIntArray272[6] = 206; //height
Tab.anIntArray240[7] = 19132; //select
Tab.anIntArray241[7] = 13; //width
Tab.anIntArray272[7] = 206; //height
Tab.anIntArray240[8] = 19139; //sprite
Tab.anIntArray241[8] = 69; //width
Tab.anIntArray272[8] = 206; //height
Tab.anIntArray240[9] = 19136; //select
Tab.anIntArray241[9] = 69; //width
Tab.anIntArray272[9] = 206; //height
Tab.anIntArray240[10] = 149; //energytext
Tab.anIntArray241[10] = 74; //width
Tab.anIntArray272[10] = 228; //height
Tab.anIntArray240[11] = 19142; //sprite
Tab.anIntArray241[11] = 125; //width
Tab.anIntArray272[11] = 206; //height
Tab.anIntArray240[12] = 19121; //box 1
Tab.anIntArray241[12] = 24; //width
Tab.anIntArray272[12] = 196; //height
Tab.anIntArray240[13] = 19125; //box 1
Tab.anIntArray241[13] = 63; //width
Tab.anIntArray272[13] = 196; //height
Tab.anIntArray240[14] = 19129; //box 1
Tab.anIntArray241[14] = 80; //width
Tab.anIntArray272[14] = 196; //height
Tab.anIntArray240[15] = 19133; //box 1
Tab.anIntArray241[15] = 22; //width
Tab.anIntArray272[15] = 183; //height
Tab.anIntArray240[16] = 19137; //box 1
Tab.anIntArray241[16] = 74; //width
Tab.anIntArray272[16] = 183; //height
Tab.anIntArray240[17] = 19140; //box 1
Tab.anIntArray241[17] = 85; //width
Tab.anIntArray272[17] = 183; //height
Tab.anIntArray240[18] = 19023; //music icon
Tab.anIntArray241[18] = 3; //width
Tab.anIntArray272[18] = 45; //height
Tab.anIntArray240[19] = 19024; //effect icon
Tab.anIntArray241[19] = 3; //width
Tab.anIntArray272[19] = 81; //height
Tab.anIntArray240[20] = 19025; //bar 1
Tab.anIntArray241[20] = 43; //width
Tab.anIntArray272[20] = 55; //height
Tab.anIntArray240[21] = 19026; //bar 2
Tab.anIntArray241[21] = 65; //width
Tab.anIntArray272[21] = 55; //height
Tab.anIntArray240[22] = 930; //music off
Tab.anIntArray241[22] = 47; //width
Tab.anIntArray272[22] = 50; //height
Tab.anIntArray240[23] = 19026; //bar3
Tab.anIntArray241[23] = 96; //width
Tab.anIntArray272[23] = 55; //height
Tab.anIntArray240[24] = 931; //music volume1
Tab.anIntArray241[24] = 78; //width
Tab.anIntArray272[24] = 50; //height
Tab.anIntArray240[25] = 19026; //bar4
Tab.anIntArray241[25] = 127; //width
Tab.anIntArray272[25] = 55; //height
Tab.anIntArray240[26] = 932; //music volume2
Tab.anIntArray241[26] = 109; //width
Tab.anIntArray272[26] = 50; //height
Tab.anIntArray240[27] = 19027; //bar5
Tab.anIntArray241[27] = 158; //width
Tab.anIntArray272[27] = 55; //height
Tab.anIntArray240[28] = 934; //music volume4
Tab.anIntArray241[28] = 140; //width
Tab.anIntArray272[28] = 50; //height
Tab.anIntArray240[29] = 19025; //bar 1
Tab.anIntArray241[29] = 43; //width
Tab.anIntArray272[29] = 91; //height
Tab.anIntArray240[30] = 19026; //bar 2
Tab.anIntArray241[30] = 65; //width
Tab.anIntArray272[30] = 91; //height
Tab.anIntArray240[31] = 941; //music off
Tab.anIntArray241[31] = 47; //width
Tab.anIntArray272[31] = 86; //height
Tab.anIntArray240[32] = 19026; //bar3
Tab.anIntArray241[32] = 96; //width
Tab.anIntArray272[32] = 91; //height
Tab.anIntArray240[33] = 942; //music volume1
Tab.anIntArray241[33] = 78; //width
Tab.anIntArray272[33] = 86; //height
Tab.anIntArray240[34] = 19026; //bar4
Tab.anIntArray241[34] = 127; //width
Tab.anIntArray272[34] = 91; //height
Tab.anIntArray240[35] = 944; //music volume2
Tab.anIntArray241[35] = 109; //width
Tab.anIntArray272[35] = 86; //height
Tab.anIntArray240[36] = 19027; //bar5
Tab.anIntArray241[36] = 158; //width
Tab.anIntArray272[36] = 91; //height
Tab.anIntArray240[37] = 945; //music volume4
Tab.anIntArray241[37] = 140; //width
Tab.anIntArray272[37] = 86; //height
Tab.anIntArray240[38] = 19143; //light icon
Tab.anIntArray241[38] = 3; //width
Tab.anIntArray272[38] = 8; //height
Tab.anIntArray240[39] = 19144; //area icon
Tab.anIntArray241[39] = 4; //width
Tab.anIntArray272[39] = 119; //height
Tab.anIntArray240[40] = 19025; //bar 1
Tab.anIntArray241[40] = 43; //width
Tab.anIntArray272[40] = 18; //height
Tab.anIntArray240[41] = 19026; //bar 2
Tab.anIntArray241[41] = 65; //width
Tab.anIntArray272[41] = 18; //height
Tab.anIntArray240[42] = 19026; //bar3
Tab.anIntArray241[42] = 96; //width
Tab.anIntArray272[42] = 18; //height
Tab.anIntArray240[43] = 19026; //bar4
Tab.anIntArray241[43] = 127; //width
Tab.anIntArray272[43] = 18; //height
Tab.anIntArray240[44] = 19027; //bar5
Tab.anIntArray241[44] = 158; //width
Tab.anIntArray272[44] = 18; //height
Tab.anIntArray240[45] = 19025; //bar 1
Tab.anIntArray241[45] = 43; //width
Tab.anIntArray272[45] = 128; //height
Tab.anIntArray240[46] = 19026; //bar 2
Tab.anIntArray241[46] = 65; //width
Tab.anIntArray272[46] = 128; //height
Tab.anIntArray240[47] = 19026; //bar3
Tab.anIntArray241[47] = 96; //width
Tab.anIntArray272[47] = 128; //height
Tab.anIntArray240[48] = 19026; //bar4
Tab.anIntArray241[48] = 127; //width
Tab.anIntArray272[48] = 128; //height
Tab.anIntArray240[49] = 19027; //bar5
Tab.anIntArray241[49] = 158; //width
Tab.anIntArray272[49] = 128; //height
Tab.anIntArray240[50] = 19146; //bar4
Tab.anIntArray241[50] = 47; //width
Tab.anIntArray272[50] = 13; //height
Tab.anIntArray240[51] = 19145; //bar5
Tab.anIntArray241[51] = 47; //width
Tab.anIntArray272[51] = 13; //height
Tab.anIntArray240[52] = 19146; //bar4
Tab.anIntArray241[52] = 78; //width
Tab.anIntArray272[52] = 13; //height
Tab.anIntArray240[53] = 19147; //bar5
Tab.anIntArray241[53] = 78; //width
Tab.anIntArray272[53] = 13; //height
Tab.anIntArray240[54] = 19146; //bar4
Tab.anIntArray241[54] = 109; //width
Tab.anIntArray272[54] = 13; //height
Tab.anIntArray240[55] = 19148; //bar5
Tab.anIntArray241[55] = 109; //width
Tab.anIntArray272[55] = 13; //height
Tab.anIntArray240[56] = 19146; //bar4
Tab.anIntArray241[56] = 140; //width
Tab.anIntArray272[56] = 13; //height
Tab.anIntArray240[57] = 19149; //bar5
Tab.anIntArray241[57] = 140; //width
Tab.anIntArray272[57] = 13; //height
Tab.anIntArray240[58] = 19146; //bar4
Tab.anIntArray241[58] = 47; //width
Tab.anIntArray272[58] = 123; //height
Tab.anIntArray240[59] = 19150; //bar5
Tab.anIntArray241[59] = 47; //width
Tab.anIntArray272[59] = 123; //height
Tab.anIntArray240[60] = 19146; //bar4
Tab.anIntArray241[60] = 78; //width
Tab.anIntArray272[60] = 123; //height
Tab.anIntArray240[61] = 19151; //bar5
Tab.anIntArray241[61] = 78; //width
Tab.anIntArray272[61] = 123; //height
Tab.anIntArray240[62] = 19146; //bar4
Tab.anIntArray241[62] = 109; //width
Tab.anIntArray272[62] = 123; //height
Tab.anIntArray240[63] = 19152; //bar5
Tab.anIntArray241[63] = 109; //width
Tab.anIntArray272[63] = 123; //height
Tab.anIntArray240[64] = 19146; //bar4
Tab.anIntArray241[64] = 140; //width
Tab.anIntArray272[64] = 123; //height
Tab.anIntArray240[65] = 19153; //bar5
Tab.anIntArray241[65] = 140; //width
Tab.anIntArray272[65] = 123; //height

}


public static void Starters(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intStarters = AddTab(18751);
intStarters.anIntArray240 = new int[11];
intStarters.anIntArray241 = new int[11];
intStarters.anIntArray272 = new int[11];
//Main interface
intStarters.anIntArray240[0] = 18752;
intStarters.anIntArray241[0] = 4;
intStarters.anIntArray272[0] = 16;
AddInterfaceImage(18752, "Starters", "Custom 15107.png");
//Control 1 of main interface (Label)
intStarters.anIntArray240[1] = 18753;
intStarters.anIntArray241[1] = 189;
intStarters.anIntArray272[1] = 36;
AddInterfaceLabel(18753, "Pick Your Starter!", wid, 1, 0x008000);
//Control 2 of main interface (TextButton)
intStarters.anIntArray240[2] = 18754;
intStarters.anIntArray241[2] = 189;
intStarters.anIntArray272[2] = 251;
//Control 3B of main interface (TextButton)
intStarters.anIntArray240[3] = 18755;
intStarters.anIntArray241[3] = 210;
intStarters.anIntArray272[3] = 262;
AddInterfaceLabel(18755, "Ranger", wid, 1, 0xFFA500);
AddInterfaceButton(18754, 90, 41, "Ranger", "Starters", "DefaultButton.png");
//Control 4 of main interface (TextButton)
intStarters.anIntArray240[4] = 18756;
intStarters.anIntArray241[4] = 349;
intStarters.anIntArray272[4] = 251;
//Control 5B of main interface (TextButton)
intStarters.anIntArray240[5] = 18757;
intStarters.anIntArray241[5] = 370;
intStarters.anIntArray272[5] = 262;
AddInterfaceLabel(18757, "Mage", wid, 1, 0xFFA500);
AddInterfaceButton(18756, 90, 41, "Mage", "Starters", "DefaultButton.png");
//Control 6 of main interface (Image)
intStarters.anIntArray240[6] = 18758;
intStarters.anIntArray241[6] = 60;
intStarters.anIntArray272[6] = 100;
AddInterfaceImage(18758, "Starters", "Normal.PNG");
//Control 7 of main interface (Image)
intStarters.anIntArray240[7] = 18759;
intStarters.anIntArray241[7] = 216;
intStarters.anIntArray272[7] = 100;
AddInterfaceImage(18759, "Starters", "Ranger.PNG");
//Control 8 of main interface (Image)
intStarters.anIntArray240[8] = 18760;
intStarters.anIntArray241[8] = 367;
intStarters.anIntArray272[8] = 100;
AddInterfaceImage(18760, "Starters", "Mage.png");
//Control 9 of main interface (TextButton)
intStarters.anIntArray240[9] = 18761;
intStarters.anIntArray241[9] = 41;
intStarters.anIntArray272[9] = 251;
//Control 10B of main interface (TextButton)
intStarters.anIntArray240[10] = 18762;
intStarters.anIntArray241[10] = 62;
intStarters.anIntArray272[10] = 262;
AddInterfaceLabel(18762, "Normal", wid, 1, 0xFFA500);
AddInterfaceButton(18761, 90, 41, "Normal", "Starters", "DefaultButton.png");
}


public static void Teleports(Class30_Sub2_Sub1_Sub4[] wid) {
Class9 intTeleports = AddTab(17000);
intTeleports.anIntArray240 = new int[24];
intTeleports.anIntArray241 = new int[24];
intTeleports.anIntArray272 = new int[24];
//Main interface
intTeleports.anIntArray240[0] = 17001;
intTeleports.anIntArray241[0] = 4;
intTeleports.anIntArray272[0] = 16;
//No main interface image.
//Control 1 of main interface (ClickableLabel)
intTeleports.anIntArray240[1] = 17002;
intTeleports.anIntArray241[1] = 9;
intTeleports.anIntArray272[1] = 52;
AddClickableText(17002, "Home", "Home", wid, 1, 0xFFFFFF, 39, 20);
//Control 2 of main interface (Label)
intTeleports.anIntArray240[2] = 17003;
intTeleports.anIntArray241[2] = 51;
intTeleports.anIntArray272[2] = 21;
AddInterfaceLabel(17003, "Teleports", wid, 3, 0xFFA500);
//Control 3 of main interface (ClickableLabel)
intTeleports.anIntArray240[3] = 17004;
intTeleports.anIntArray241[3] = 48;
intTeleports.anIntArray272[3] = 52;
AddClickableText(17004, "Train", "Train", wid, 1, 0x008000, 37, 20);
//Control 4 of main interface (ClickableLabel)
intTeleports.anIntArray240[4] = 17005;
intTeleports.anIntArray241[4] = 87;
intTeleports.anIntArray272[4] = 52;
AddClickableText(17005, "Skillz", "Skillz", wid, 1, 0xFFA500, 38, 20);
//Control 5 of main interface (ClickableLabel)
intTeleports.anIntArray240[5] = 17006;
intTeleports.anIntArray241[5] = 126;
intTeleports.anIntArray272[5] = 52;
AddClickableText(17006, "Edge", "Edge", wid, 1, 0xC00000, 36, 20);
//Control 6 of main interface (ClickableLabel)
intTeleports.anIntArray240[6] = 17007;
intTeleports.anIntArray241[6] = 9;
intTeleports.anIntArray272[6] = 72;
AddClickableText(17007, "Theiv", "Theiv", wid, 1, 0x008000, 39, 20);
//Control 7 of main interface (ClickableLabel)
intTeleports.anIntArray240[7] = 17008;
intTeleports.anIntArray241[7] = 48;
intTeleports.anIntArray272[7] = 72;
AddClickableText(17008, "Fish", "Fish", wid, 1, 0x008000, 32, 20);
//Control 8 of main interface (ClickableLabel)
intTeleports.anIntArray240[8] = 17009;
intTeleports.anIntArray241[8] = 87;
intTeleports.anIntArray272[8] = 72;
AddClickableText(17009, "Hang", "Hang", wid, 1, 0xFFA500, 37, 20);
//Control 9 of main interface (ClickableLabel)
intTeleports.anIntArray240[9] = 17010;
intTeleports.anIntArray241[9] = 126;
intTeleports.anIntArray272[9] = 72;
AddClickableText(17010, "Barrows", "Barrows", wid, 1, 0xFFA500, 54, 20);
//Control 10 of main interface (ClickableLabel)
intTeleports.anIntArray240[10] = 17011;
intTeleports.anIntArray241[10] = 9;
intTeleports.anIntArray272[10] = 92;
AddClickableText(17011, "Shops", "Shops", wid, 1, 0xFFA500, 44, 20);
//Control 11 of main interface (ClickableLabel)
intTeleports.anIntArray240[11] = 17012;
intTeleports.anIntArray241[11] = 48;
intTeleports.anIntArray272[11] = 92;
AddClickableText(17012, "Wcing", "Woodcutting", wid, 1, 0xFFA500, 41, 20);
//Control 12 of main interface (ClickableLabel)
intTeleports.anIntArray240[12] = 17013;
intTeleports.anIntArray241[12] = 87;
intTeleports.anIntArray272[12] = 92;
AddClickableText(17013, "Mining", "Mining", wid, 1, 0xFFA500, 45, 20);
//Control 13 of main interface (ClickableLabel)
intTeleports.anIntArray240[13] = 17014;
intTeleports.anIntArray241[13] = 126;
intTeleports.anIntArray272[13] = 92;
AddClickableText(17014, "Kbd", "King Black Dragon", wid, 1, 0xC00000, 30, 20);
//Control 14 of main interface (ClickableLabel)
intTeleports.anIntArray240[14] = 17015;
intTeleports.anIntArray241[14] = 9;
intTeleports.anIntArray272[14] = 112;
AddClickableText(17015, "Dag", "Dag", wid, 1, 0x008000, 30, 20);
//Control 15 of main interface (ClickableLabel)
intTeleports.anIntArray240[15] = 17016;
intTeleports.anIntArray241[15] = 48;
intTeleports.anIntArray272[15] = 112;
AddClickableText(17016, "Ports", "Ports", wid, 1, 0xFFA500, 40, 20);
//Control 16 of main interface (ClickableLabel)
intTeleports.anIntArray240[16] = 17017;
intTeleports.anIntArray241[16] = 87;
intTeleports.anIntArray272[16] = 112;
AddClickableText(17017, "Pking", "Pking", wid, 1, 0xC00000, 39, 20);
//Control 17 of main interface (ClickableLabel)
intTeleports.anIntArray240[17] = 17018;
intTeleports.anIntArray241[17] = 126;
intTeleports.anIntArray272[17] = 112;
AddClickableText(17018, "Phatmini", "Phatmini", wid, 1, 0x008000, 57, 20);
//Control 18 of main interface (ClickableLabel)
intTeleports.anIntArray240[18] = 17019;
intTeleports.anIntArray241[18] = 9;
intTeleports.anIntArray272[18] = 132;
AddClickableText(17019, "Gwd", "Gwd", wid, 1, 0xC00000, 31, 20);
//Control 19 of main interface (ClickableLabel)
intTeleports.anIntArray240[19] = 17020;
intTeleports.anIntArray241[19] = 48;
intTeleports.anIntArray272[19] = 132;
AddClickableText(17020, "Slayer", "Slayer", wid, 1, 0x008000, 45, 20);
//Control 20 of main interface (ClickableLabel)
intTeleports.anIntArray240[20] = 17021;
intTeleports.anIntArray241[20] = 93;
intTeleports.anIntArray272[20] = 132;
AddClickableText(17021, "Farm", "Farm", wid, 1, 0x008000, 36, 20);
//Control 21 of main interface (ClickableLabel)
intTeleports.anIntArray240[21] = 17022;
intTeleports.anIntArray241[21] = 129;
intTeleports.anIntArray272[21] = 132;
AddClickableText(17022, "Kqueen", "Kqeen", wid, 1, 0xFFA500, 51, 20);
//Control 22 of main interface (ClickableLabel)
intTeleports.anIntArray240[22] = 17023;
intTeleports.anIntArray241[22] = 9;
intTeleports.anIntArray272[22] = 152;
AddClickableText(17023, "Corp", "Corporeal Beast", wid, 1, 0xC00000, 35, 20);
//Control 23 of main interface (ClickableLabel)
intTeleports.anIntArray240[23] = 17024;
intTeleports.anIntArray241[23] = 44;
intTeleports.anIntArray272[23] = 152;
AddClickableText(17024, "Jad", "Jad", wid, 1, 0xC00000, 30, 20);
}
	private static Class30_Sub2_Sub1_Sub1 test(int i) {
		String s = "";
        	long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        	Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        	if(class30_sub2_sub1_sub1 != null)
           	 return class30_sub2_sub1_sub1;
        	try
       	 {
	class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(signlink.findcachedir() +"/Sprites/InterfaceSprites/Emotes/"+i+".png"); //edit to where the sprites are located
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
      	  }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

public static void Custom2(int W ,int H,int D, int k,int j,int o, String s)
    {
        Class9 Tab = addTab(D);
        Tab.anInt236 = 147;
        Tab.anInt250 = D;
        Tab.anInt262 = 5;
        Tab.anInt217 = 4;
        Tab.anInt214 = 0;
        Tab.anInt220 = 0;
        Tab.anInt267 = 0;
        Tab.aByte254 = 0;
        Tab.anInt230 = -1;
        Tab.anIntArray245 = new int[1];
        Tab.anIntArray212 = new int[1];
        Tab.anIntArray245[0] = 1;
        Tab.anIntArray212[0] = 1;
        Tab.anIntArrayArray226 = new int[1][3];
        Tab.anIntArrayArray226[0][0] = 5;
        Tab.anIntArrayArray226[0][1] = o;
        Tab.anIntArrayArray226[0][2] = 0;
        Tab.aClass30_Sub2_Sub1_Sub1_260 = test(k);
        Tab.aClass30_Sub2_Sub1_Sub1_207 = test(j);
        Tab.aString221 = s;
    }

public static void Emote(Class44 sl, Class30_Sub2_Sub1_Sub4 tda[]){

	int A = 11;
	int B = 6;
	int C = 0;
	int D = 161;
	Class9 Tab = addTab(147);
        Tab.anIntArray240 = new int[1];
        Tab.anIntArray241 = new int[1];
        Tab.anIntArray272 = new int[1];
        Tab.anIntArray240[0] = 148;
        Tab.anIntArray241[0] = 2;
        Tab.anIntArray272[0] = 0;

Custom1(25,47,D, 1, "Yes");D++;
Custom1(25,47,D, 2, "No");D++;
Custom1(29,39,D, 3, "Bow");D++;
Custom1(29,47,D, 4, "Angry");D++;
Custom1(28,47,D, 5, "Think");D++;
Custom1(32,47,D, 6, "Wave");D++;
Custom1(31,47,D, 7, "Shrug");D++;
Custom1(35,47,D, 8, "Cheer");D++;

Custom1(28,47,D, 9,"Beckon");D++;
Custom1(25,47,D, 10, "Laugh");D++;
Custom1(34,43,D, 11, "Jump for joy");D++;
Custom1(29,47,D, 12, "Yawn");D++;D++;
Custom1(31,47,D, 13, "Dance");D++;
Custom1(30,47,D, 14, "Jig");D++;
Custom1(40,47,D, 15, "Spin");D++;
Custom1(38,47,D, 16, "Headbang");D++;

Custom1(31,46,D, 17, "Cry");D++;
Custom1(28,47,D, 18, "Blow Kiss");D++;
Custom1(23,47,D, 19, "Panic");D++;
Custom1(35,47,D, 20, "Raspberry");D++;
Custom1(28,47,D, 21, "Clap");D++;
Custom1(27,47,D, 22, "Salute");D++;

Custom1(39,41,D, 23, "Goblin dance");D++;
Custom2(39,41,D, 23,34,550, "Goblin dance");D++;
Custom1(31,47,D, 24, "Goblin Salute");D++;
Custom2(31,47,D, 24,35,551, "Goblin Salute");
D = 13362;
Custom1(32,47,D, 25, "Glass Box");D++;
Custom2(32,47,D, 25,36,552, "Glass Box");D++;
Custom1(26,48,D, 26, "Climb Rope");D++;
Custom2(26,48,D, 26,37,553, "Climb Rope");D++;
Custom1(32,47,D, 27, "Lean");D++;
Custom2(32,47,D, 27,38,554, "Lean");D++;
Custom1(26,48,D, 28, "Glass Wall");D++;
Custom2(26,48,D, 28,39,555, "Glass Wall");D++;
Custom1(26,48,D, 29, "Idea");D++;
Custom2(26,48,D, 29,40,556, "Idea");D++;
Custom1(26,48,D, 30, "Stomp");D++;
Custom2(26,48,D, 30,41,557, "Stomp");D++;
Custom1(26,48,D, 31, "Flap");D++;
Custom2(26,48,D, 31,42,558, "Flap");D++;
Custom1(26,48,D, 32, "Slap Head");D++;
Custom2(26,48,D, 32,43,559, "Slap Head");D++;
Custom1(29,47,D, 33, "Zombie Walk");D++;
Custom2(29,47,D, 33,44,560, "Zombie Walk");D++;
Custom1(28,46,D, 34, "Zombie Dance");D++;
Custom2(28,46,D, 35,45,561, "Zombie Dance");D++;
Custom1(29,42,D, 35, "Scared");D++;
Custom2(29,42,D, 35,46,562, "Scared");D++;
Custom1(18,45,D, 36, "Bunny Hop");D++;
Custom2(18,45,D, 36,47,563, "Bunny Hop");D++;
Custom1(41,47,D, 37, "Skill Cape");D++;
Custom2(41,47,D, 37,48,564, "Skill Cape");D++;



	D = 161;
	Tab = addTab(148);
	Tab.anInt236 = 147;
	Tab.anInt250 = 148;
	Tab.anInt262 = 0;
	Tab.anInt217 = 0;
	Tab.anInt214 = 0;
	Tab.anInt220 = 172;
	Tab.anInt267 = 257;
	Tab.aByte254 = 0;
	Tab.anInt230 = -1;
	Tab.anInt261 = 460;
	Tab.aBoolean266 = false;
        Tab.anIntArray240 = new int[44];
        Tab.anIntArray241 = new int[44];
        Tab.anIntArray272 = new int[44];
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=45;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=48;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B+7;D++;C++;A+=43;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D++;C++;A = 9;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=40;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=49;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=42;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D++;C++;A = 7;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=46;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=48;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=45;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D++;D++;C++;A = 6;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=45;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=41;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=46;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D++;C++;A = 8;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=43;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=49;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=39;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D++;C++;A = 11;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=48;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=36;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B+6;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B+6;D++;C++;A+=51;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D = 13362;C++;A = 2;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=51;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=45;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=46;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D++;C++;A = 10;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=42;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=47;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;A+=50;A-=2;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;
	D++;C++;A = 7;B += 50;
        Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;D++;C++;Tab.anIntArray240[C] = D;        Tab.anIntArray241[C] = A;        Tab.anIntArray272[C] = B;

	}

	public static void Custom1(int W ,int H,int i, int k, String s)
    {
        Class9 Tab = aClass9Array210[i] = new Class9();
        Tab.anInt250 = i;
        Tab.anInt236 = i;
        Tab.anInt262 = 5;
        Tab.anInt217 = 1;
        Tab.anInt214 = 0;
        Tab.anInt220 = W;
        Tab.anInt267 = H;
        Tab.aByte254 = 0;
        Tab.anInt230 = 52;
        Tab.aClass30_Sub2_Sub1_Sub1_207 = test(k);
        Tab.aClass30_Sub2_Sub1_Sub1_260 = test(k);
        Tab.aString221 = s;
    }

    public static void addEquipment(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt214 = 0;
        class9.anInt220 = 40;
        class9.anInt267 = 39;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = Run(j, "custom2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = Run(k, "custom2");
  class9.aString221 = s;
        Class9 _tmp = class9;
      
    }


    public static void addEquipment2(int i, int j, int k, String s)
    {
        Class9 class9 = aClass9Array210[i] = new Class9();
        class9.anInt250 = i;
        class9.anInt236 = i;
        class9.anInt262 = 5;
        class9.anInt217 = 6;
        class9.anInt214 = 0;
        class9.anInt220 = 21;
        class9.anInt267 = 21;
        class9.aByte254 = 0;
        class9.anInt230 = 52;
        class9.aClass30_Sub2_Sub1_Sub1_207 = Run(j, "custom2");
        class9.aClass30_Sub2_Sub1_Sub1_260 = Run(k, "custom2");
  class9.aString221 = s;
        Class9 _tmp = class9;
      
    }

        public static void EquipmentTab(Class30_Sub2_Sub1_Sub4[] wid)
        {
                Class9 t = aClass9Array210[1644];
                /*addActionButton(ID, SpriteON, SpriteOFF, SpriteX, SpriteY, "SpriteText");*/
                addActionButton(15101, 15101, 15101, 40, 39, "Show Equipment Screen");
                addActionButton(15102, 15102, 15102, 40, 39, "Items Kept on Death");
                /*removeSomething(ID)*/
                removeSomething(15103);
                removeSomething(15104);

                t.anIntArray240[23] = 15101;
                t.anIntArray241[23] = 41;
                t.anIntArray272[23] = 212;
                t.anIntArray240[24] = 15102;
                t.anIntArray241[24] = 41+39+30;
                t.anIntArray272[24] = 212;
                t.anIntArray240[25] = 15103;
                t.anIntArray241[25] = 41;
                t.anIntArray272[25] = 212;
                t.anIntArray240[26] = 15104;
                t.anIntArray241[26] = 41+39+30;
                t.anIntArray272[26] = 212;

addSprite(29146, 1, "Equipment/aura");
addAura(10794);
addButton(29145, 2, "Equipment/aura", 36, 36, "Remove", 1);
               setBounds(29145, 37, 5, 26, t);
		//setBounds(19146, 37, 5, 24, t);
		//setBounds(10794, 39, 7, 25, t);

        }

        public static void equipmentScreen(Class30_Sub2_Sub1_Sub4[] var0) {
            Class9 var1 = addTab(19148);
            addSprite(19149, 0, "Equipment/CHAR");
            addHover(19150, 3, 0, 19151, 3, "Equipment/CHAR", 21, 21, "Close");
            addHovered(19151, 2, "Equipment/CHAR", 21, 21, 19152);
            addText8(19154, "Equip Your Character...", 16750623, false, true, 52, var0, 2);
            addText8(1673, "Attack bonus", 16750623, false, true, 52, var0, 2);
            addText8(1674, "Defense bonus", 16750623, false, true, 52, var0, 2);
            addText8(1685, "Other bonuses", 16750623, false, true, 52, var0, 2);
            addText8(1675, "Stab:", 16750623, false, true, 52, var0, 1);
            addText8(1676, "Slash:", 16750623, false, true, 52, var0, 1);
            addText8(1677, "Crush:", 16750623, false, true, 52, var0, 1);
            addText8(1678, "Magic:", 16750623, false, true, 52, var0, 1);
            addText8(1679, "Ranged:", 16750623, false, true, 52, var0, 1);
            addText8(1680, "Stab:", 16750623, false, true, 52, var0, 1);
            addText8(1681, "Slash:", 16750623, false, true, 52, var0, 1);
            addText8(1682, "Crush:", 16750623, false, true, 52, var0, 1);
            addText8(1683, "Magic:", 16750623, false, true, 52, var0, 1);
            addText8(1684, "Ranged:", 16750623, false, true, 52, var0, 1);
            addText8(1686, "Strength:", 16750623, false, true, 52, var0, 1);
            addText8(1687, "Prayer:", 16750623, false, true, 52, var0, 1);
            addText8(19155, "0%", 16750623, false, true, 52, var0, 1);
            addChar(19153);
            byte var2 = 45;
            byte var3 = 0;
            setChildren(var2, var1);
            setBounds(19149, 12, 20, var3, var1);
            int var4 = var3 + 1;
            setBounds(19150, 472, 27, var4, var1);
            ++var4;
            setBounds(19151, 472, 27, var4, var1);
            ++var4;
            setBounds(19153, 193, 190, var4, var1);
            ++var4;
            setBounds(19154, 23, 29, var4, var1);
            ++var4;
            setBounds(1673, 365, 71, var4, var1);
            ++var4;
            setBounds(1674, 365, 163, var4, var1);
            ++var4;
            setBounds(1675, 372, 85, var4, var1);
            ++var4;
            setBounds(1676, 372, 99, var4, var1);
            ++var4;
            setBounds(1677, 372, 113, var4, var1);
            ++var4;
            setBounds(1678, 372, 127, var4, var1);
            ++var4;
            setBounds(1679, 372, 141, var4, var1);
            ++var4;
            setBounds(1680, 372, 177, var4, var1);
            ++var4;
            setBounds(1681, 372, 191, var4, var1);
            ++var4;
            setBounds(1682, 372, 205, var4, var1);
            ++var4;
            setBounds(1683, 372, 219, var4, var1);
            ++var4;
            setBounds(1684, 372, 233, var4, var1);
            ++var4;
            setBounds(1685, 365, 253, var4, var1);
            ++var4;
            setBounds(1686, 372, 267, var4, var1);
            ++var4;
            setBounds(1687, 372, 281, var4, var1);
            ++var4;
            setBounds(19155, 94, 286, var4, var1);
            ++var4;
            setBounds(1645, 83, 106, var4, var1);
            ++var4;
            setBounds(1646, 83, 135, var4, var1);
            ++var4;
            setBounds(1647, 83, 172, var4, var1);
            ++var4;
            setBounds(1648, 83, 213, var4, var1);
            ++var4;
            setBounds(1649, 27, 185, var4, var1);
            ++var4;
            setBounds(1650, 27, 221, var4, var1);
            ++var4;
            setBounds(1651, 139, 185, var4, var1);
            ++var4;
            setBounds(1652, 139, 221, var4, var1);
            ++var4;
            setBounds(1653, 53, 148, var4, var1);
            ++var4;
            setBounds(1654, 112, 148, var4, var1);
            ++var4;
            setBounds(1655, 63, 109, var4, var1);
            ++var4;
            setBounds(1656, 117, 108, var4, var1);
            ++var4;
            setBounds(1657, 83, 71, var4, var1);
            ++var4;
            setBounds(1658, 42, 110, var4, var1);
            ++var4;
            setBounds(1659, 83, 110, var4, var1);
            ++var4;
            setBounds(1660, 124, 110, var4, var1);
            ++var4;
            setBounds(1661, 27, 149, var4, var1);
            ++var4;
            setBounds(1662, 83, 149, var4, var1);
            ++var4;
            setBounds(1663, 139, 149, var4, var1);
            ++var4;
            setBounds(1664, 83, 189, var4, var1);
            ++var4;
            setBounds(1665, 83, 229, var4, var1);
            ++var4;
            setBounds(1666, 27, 229, var4, var1);
            ++var4;
            setBounds(1667, 139, 229, var4, var1);
            ++var4;
            setBounds(1688, 29, 111, var4, var1);
            ++var4;
         }

    public static void getLunar(Class44 class44, Class30_Sub2_Sub1_Sub4 aclass30_sub2_sub1_sub4[])
    {
        String s = signlink.findcachedir() +"/Sprites/InterfaceSprites/";
        String s1 = "";
        int i = 0;
        Class9 class9 = aClass9Array210[18787] = new Class9();
        class9.anInt250 = 18787;
        class9.anInt236 = 18787;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 512;
        class9.anInt267 = 334;
        class9.anIntArray240 = new int[41];
        class9.anIntArray241 = new int[41];
        class9.anIntArray272 = new int[41];
        class9.anIntArray240[0] = 12856;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 178;
        class9.anIntArray240[1] = 18788;
        class9.anIntArray241[1] = 20;
        class9.anIntArray272[1] = 22;
        class9.anIntArray240[2] = 18789;
        class9.anIntArray241[2] = 3;
        class9.anIntArray272[2] = 184;
        class9.anIntArray240[3] = 18804;
        class9.anIntArray241[3] = 60;
        class9.anIntArray272[3] = 22;
        class9.anIntArray240[4] = 18805;
        class9.anIntArray241[4] = 3;
        class9.anIntArray272[4] = 184;
        class9.anIntArray240[5] = 18808;
        class9.anIntArray241[5] = 100;
        class9.anIntArray272[5] = 22;
        class9.anIntArray240[6] = 18809;
        class9.anIntArray241[6] = 3;
        class9.anIntArray272[6] = 184;
        class9.anIntArray240[7] = 18824;
        class9.anIntArray241[7] = 140;
        class9.anIntArray272[7] = 22;
        class9.anIntArray240[8] = 18828;
        class9.anIntArray241[8] = 20;
        class9.anIntArray272[8] = 54;
        class9.anIntArray240[9] = 18829;
        class9.anIntArray241[9] = 3;
        class9.anIntArray272[9] = 184;
        class9.anIntArray240[10] = 18832;
        class9.anIntArray241[10] = 60;
        class9.anIntArray272[10] = 54;
        class9.anIntArray240[11] = 18833;
        class9.anIntArray241[11] = 3;
        class9.anIntArray272[11] = 184;
        class9.anIntArray240[12] = 18836;
        class9.anIntArray241[12] = 100;
        class9.anIntArray272[12] = 54;
        class9.anIntArray240[13] = 18837;
        class9.anIntArray241[13] = 3;
        class9.anIntArray272[13] = 184;
        class9.anIntArray240[14] = 18840;
        class9.anIntArray241[14] = 140;
        class9.anIntArray272[14] = 54;
        class9.anIntArray240[15] = 18841;
        class9.anIntArray241[15] = 3;
        class9.anIntArray272[15] = 184;
        class9.anIntArray240[16] = 18825;
        class9.anIntArray241[16] = 3;
        class9.anIntArray272[16] = 184;
        class9.anIntArray240[17] = 18792;
        class9.anIntArray241[17] = 20;
        class9.anIntArray272[17] = 86;
        class9.anIntArray240[18] = 18793;
        class9.anIntArray241[18] = 3;
        class9.anIntArray272[18] = 184;
        class9.anIntArray240[19] = 18796;
        class9.anIntArray241[19] = 60;
        class9.anIntArray272[19] = 86;
        class9.anIntArray240[20] = 18797;
        class9.anIntArray241[20] = 3;
        class9.anIntArray272[20] = 184;
        class9.anIntArray240[21] = 18800;
        class9.anIntArray241[21] = 100;
        class9.anIntArray272[21] = 86;
        class9.anIntArray240[22] = 18801;
        class9.anIntArray241[22] = 3;
        class9.anIntArray272[22] = 184;
        class9.anIntArray240[23] = 18812;
        class9.anIntArray241[23] = 140;
        class9.anIntArray272[23] = 86;
        class9.anIntArray240[24] = 18813;
        class9.anIntArray241[24] = 3;
        class9.anIntArray272[24] = 184;
        class9.anIntArray240[25] = 18816;
        class9.anIntArray241[25] = 20;
        class9.anIntArray272[25] = 118;
        class9.anIntArray240[26] = 18817;
        class9.anIntArray241[26] = 3;
        class9.anIntArray272[26] = 184;
        class9.anIntArray240[27] = 18820;
        class9.anIntArray241[27] = 60;
        class9.anIntArray272[27] = 118;
        class9.anIntArray240[28] = 18821;
        class9.anIntArray241[28] = 3;
        class9.anIntArray272[28] = 184;
        class9.anIntArray240[29] = 18844;
        class9.anIntArray241[29] = 100;
        class9.anIntArray272[29] = 118;
        class9.anIntArray240[30] = 18845;
        class9.anIntArray241[30] = 3;
        class9.anIntArray272[30] = 184;
        class9.anIntArray240[31] = 18848;
        class9.anIntArray241[31] = 140;
        class9.anIntArray272[31] = 118;
        class9.anIntArray240[32] = 18849;
        class9.anIntArray241[32] = 3;
        class9.anIntArray272[32] = 184;
        class9.anIntArray240[33] = 18852;
        class9.anIntArray241[33] = 20;
        class9.anIntArray272[33] = 150;
        class9.anIntArray240[34] = 18853;
        class9.anIntArray241[34] = 3;
        class9.anIntArray272[34] = 184;
        class9.anIntArray240[35] = 18856;
        class9.anIntArray241[35] = 60;
        class9.anIntArray272[35] = 150;
        class9.anIntArray240[36] = 18857;
        class9.anIntArray241[36] = 3;
        class9.anIntArray272[36] = 184;
        class9.anIntArray240[37] = 18860;
        class9.anIntArray241[37] = 100;
        class9.anIntArray272[37] = 150;
        class9.anIntArray240[38] = 18861;
        class9.anIntArray241[38] = 3;
        class9.anIntArray272[38] = 184;
        class9.anIntArray240[39] = 18864;
        class9.anIntArray241[39] = 140;
        class9.anIntArray272[39] = 150;
        class9.anIntArray240[40] = 18865;
        class9.anIntArray241[40] = 3;
        class9.anIntArray272[40] = 184;
        class9 = aClass9Array210[18788] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18788;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18789;
        s1 = "magicon3,0";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp = class9;
        class9.aString221 = "Cast @gre@Home teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18789] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18789;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18790;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18791;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18790] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18790;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Home teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18791] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18791;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18792] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18792;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18793;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 66;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,1";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,1";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        class9.aString218 = "NPC Contact";
        Class9 _tmp1 = class9;
        class9.aString221 = "Cast @gre@NPC Contact";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18793] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18793;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18794;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18795;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18794] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18794;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 67 : NPC Contact";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18795] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18795;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "1 Astral, 1 Law, 10 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18796] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18796;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18797;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 67;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,2";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,2";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        class9.aString222 = "Cast on";
        class9.aString218 = "Cure other";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18797] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18797;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18798;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18799;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18798] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18798;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 68 : Cure other";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18799] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18799;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "2 Astral, 2 Cosmic";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18800] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18800;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18801;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 67;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,3";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,3";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp2 = class9;
        class9.aString221 = "Cast @gre@Humidify";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18801] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18801;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18802;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18803;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18802] = new Class9();
        class9.anInt236 = 18802;
        class9.anInt250 = 18802;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 68 : Humidify";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18803] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18803;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "2 Astral, 5 Water";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18804] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18804;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18805;
        s1 = "magicon3,4";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp3 = class9;
        class9.aString221 = "Cast @gre@Minigame teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18805] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18805;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18806;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18807;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18806] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18806;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Minigame teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18807] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18807;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18808] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18808;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18809;
        s1 = "magicon3,5";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp4 = class9;
        class9.aString221 = "Cast @gre@Monster teleport";
        class9.anInt237 = 16;
        class9 = aClass9Array210[18809] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18809;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18810;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18811;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18810] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18810;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Monster teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18811] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18811;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18812] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18812;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18813;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 70;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,6";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,6";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp5 = class9;
        class9.aString221 = "Cast @gre@Cure me";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18813] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18813;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18814;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18815;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18814] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18814;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 71 : Cure me";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18815] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18815;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "1 Astral, 5 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18816] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18816;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18817;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 73;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,7";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,7";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp6 = class9;
        class9.aString221 = "Cast @gre@Cure group";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18817] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18817;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18818;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18819;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18818] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18818;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 74 : Cure group";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18819] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18819;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "3 Astral, 15 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18820] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18820;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18821;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 74;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,8";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,8";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        class9.aString222 = "Cast on";
        class9.aString218 = "Stat spy";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18821] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18821;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18822;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18823;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18822] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18822;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 75 : Stat spy";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18823] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18823;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "1 Astral, 2 Death, 10 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18824] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18824;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18825;
        s1 = "magicon3,9";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp7 = class9;
        class9.aString221 = "Cast @gre@Pk teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18825] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18825;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18826;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18827;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18826] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18826;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Pk teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18827] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18827;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18828] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18828;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18829;
        s1 = "magicon3,10";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp8 = class9;
        class9.aString221 = "Cast @gre@Ape atoll teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18829] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18829;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18830;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18831;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18830] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18830;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Ape atoll teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18831] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18831;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18832] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18832;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 20;
        class9.anInt267 = 20;
        class9.anInt230 = 18833;
        s1 = "magicon3,11";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp9 = class9;
        class9.aString221 = "Cast @gre@Catherby teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18833] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18833;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18834;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18835;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18834] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18834;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Catherby teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18835] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18835;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18836] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18836;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18837;
        s1 = "magicon3,12";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp10 = class9;
        class9.aString221 = "Cast @gre@Training teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18837] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18837;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18838;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18839;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18838] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18838;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Training teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18839] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18839;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18840] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18840;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18841;
        s1 = "magicon3,13";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp11 = class9;
        class9.aString221 = "Cast @gre@Ice plateau teleport";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18841] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18841;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18842;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18843;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18842] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18842;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 1 : Ice plateau teleport";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18843] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18843;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "Requires no runes to use.";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18844] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18844;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18845;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 90;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,14";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,14";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        class9.aString218 = "Energy transfer";
        class9.aString222 = "Cast on";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18845] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18845;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18846;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18847;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18846] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18846;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 91 : Energy transfer";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18847] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18847;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "5 Astral, 5 Blood";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18848] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18848;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18849;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 91;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,15";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,15";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        class9.aString218 = "Heal other";
        class9.aString222 = "Cast on";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18849] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18849;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18850;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18851;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18850] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18846;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 92 : Heal other";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18851] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18847;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "3 Astral, 3 Blood, 3 Fire";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18852] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18852;
        class9.anInt262 = 5;
        class9.anInt217 = 2;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18853;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 92;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,16";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,16";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        class9.aString218 = "Vengeance other";
        class9.aString222 = "Cast on";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18853] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18853;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18854;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18855;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18854] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18846;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 93 : Vengeance other";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18855] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18847;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "3 Astral, 2 Death, 3 Earthh";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18856] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18856;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18857;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 93;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,17";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,17";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp12 = class9;
        class9.aString221 = "Cast @gre@Vengeance";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18857] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18857;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18858;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18859;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18858] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18858;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 94 : Vengeance";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18859] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18859;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "4 Astral, 2 Death, 10 Earth";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18860] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18860;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18861;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 94;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,18";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,18";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp13 = class9;
        class9.aString221 = "Cast @gre@Heal group";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18861] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18861;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18862;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18863;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18862] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18862;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 95 : Heal group";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18863] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18863;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "5 Astral, 5 Death, 10 Blood";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
        class9 = aClass9Array210[18864] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18864;
        class9.anInt262 = 5;
        class9.anInt217 = 1;
        class9.anInt220 = 23;
        class9.anInt267 = 22;
        class9.anInt230 = 18865;
        class9.anIntArray245 = new int[1];
        class9.anIntArray212 = new int[1];
        class9.anIntArray245[0] = 3;
        class9.anIntArray212[0] = 95;
        class9.anIntArrayArray226 = new int[1][3];
        class9.anIntArrayArray226[0][0] = 2;
        class9.anIntArrayArray226[0][1] = 6;
        class9.anIntArrayArray226[0][2] = 0;
        s1 = "magicoff3,19";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_207 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        s1 = "magicon3,19";
        i = s1.lastIndexOf(",");
        class9.aClass30_Sub2_Sub1_Sub1_260 = class9.drawSprite((new StringBuilder()).append(s1.substring(0, i)).append("_").append(Integer.parseInt(s1.substring(i + 1))).append(".PNG").toString());
        Class9 _tmp14 = class9;
        class9.aString221 = "Cast @gre@Spellbook swap";
        class9.anInt237 = 10;
        class9 = aClass9Array210[18865] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18865;
        class9.anInt262 = 0;
        class9.anInt217 = 0;
        class9.anInt220 = 182;
        class9.anInt267 = 76;
        class9.aBoolean266 = true;
        class9.anIntArray240 = new int[2];
        class9.anIntArray241 = new int[2];
        class9.anIntArray272 = new int[2];
        class9.anIntArray240[0] = 18866;
        class9.anIntArray241[0] = 3;
        class9.anIntArray272[0] = 5;
        class9.anIntArray240[1] = 18867;
        class9.anIntArray241[1] = 3;
        class9.anIntArray272[1] = 18;
        class9 = aClass9Array210[18866] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18862;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 177;
        class9.anInt267 = 15;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[1];
        class9.aBoolean268 = true;
        class9.aString248 = "Level 96 : Spellbook swap";
        class9.aString228 = "";
        class9.anInt232 = 0xfff000;
        class9 = aClass9Array210[18867] = new Class9();
        class9.anInt236 = 18787;
        class9.anInt250 = 18863;
        class9.anInt262 = 4;
        class9.anInt217 = 0;
        class9.anInt220 = 175;
        class9.anInt267 = 10;
        class9.aBoolean223 = true;
        class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[0];
        class9.aBoolean268 = true;
        class9.aString248 = "5 Astral, 5 Death, 10 Law";
        class9.aString228 = "";
        class9.anInt232 = 0x6b6f33;
    }


    public static void method205(Class44 class44, Class30_Sub2_Sub1_Sub4 aclass30_sub2_sub1_sub4[], byte byte0, Class44 class44_1)
    {
        aClass12_238 = new MRUNodes(false, 50000);
        Stream class30_sub2_sub2 = new Stream(class44.method571("data", null), 891);
        int i = -1;
        int j = class30_sub2_sub2.method410();
        aClass9Array210 = new Class9[40001];
        do
        {
            if(class30_sub2_sub2.anInt1406 >= class30_sub2_sub2.aByteArray1405.length)
            {
                break;
            }
            int k = class30_sub2_sub2.method410();
            if(k == 65535)
            {
                i = class30_sub2_sub2.method410();
                k = class30_sub2_sub2.method410();
            }
            Class9 class9 = aClass9Array210[k] = new Class9();
            class9.anInt250 = k;
            class9.anInt236 = i;
fonts = aclass30_sub2_sub1_sub4;
            class9.anInt262 = class30_sub2_sub2.method408();
            class9.anInt217 = class30_sub2_sub2.method408();
            class9.anInt214 = class30_sub2_sub2.method410();
            class9.anInt220 = class30_sub2_sub2.method410();
            class9.anInt267 = class30_sub2_sub2.method410();
            class9.aByte254 = (byte)class30_sub2_sub2.method408();
            class9.anInt230 = class30_sub2_sub2.method408();
            if(class9.anInt230 != 0)
            {
                class9.anInt230 = (class9.anInt230 - 1 << 8) + class30_sub2_sub2.method408();
            } else
            {
                class9.anInt230 = -1;
            }
            int l = class30_sub2_sub2.method408();
            if(l > 0)
            {
                class9.anIntArray245 = new int[l];
                class9.anIntArray212 = new int[l];
                for(int i1 = 0; i1 < l; i1++)
                {
                    class9.anIntArray245[i1] = class30_sub2_sub2.method408();
                    class9.anIntArray212[i1] = class30_sub2_sub2.method410();
                }

            }
            int j1 = class30_sub2_sub2.method408();
            if(j1 > 0)
            {
                class9.anIntArrayArray226 = new int[j1][];
                for(int k1 = 0; k1 < j1; k1++)
                {
                    int j3 = class30_sub2_sub2.method410();
                    class9.anIntArrayArray226[k1] = new int[j3];
                    for(int l4 = 0; l4 < j3; l4++)
                    {
                        class9.anIntArrayArray226[k1][l4] = class30_sub2_sub2.method410();
                    }

                }

            }
            if(class9.anInt262 == 0)
            {
                class9.anInt261 = class30_sub2_sub2.method410();
                class9.aBoolean266 = class30_sub2_sub2.method408() == 1;
                int l1 = class30_sub2_sub2.method410();
                class9.anIntArray240 = new int[l1];
                class9.anIntArray241 = new int[l1];
                class9.anIntArray272 = new int[l1];
                for(int k3 = 0; k3 < l1; k3++)
                {
                    class9.anIntArray240[k3] = class30_sub2_sub2.method410();
                    class9.anIntArray241[k3] = class30_sub2_sub2.method411();
                    class9.anIntArray272[k3] = class30_sub2_sub2.method411();
                }

            }
            if(class9.anInt262 == 1)
            {
                class9.anInt211 = class30_sub2_sub2.method410();
                class9.aBoolean251 = class30_sub2_sub2.method408() == 1;
            }
            if(class9.anInt262 == 2)
            {
                class9.anIntArray253 = new int[class9.anInt220 * class9.anInt267];
                class9.anIntArray252 = new int[class9.anInt220 * class9.anInt267];
                class9.aBoolean259 = class30_sub2_sub2.method408() == 1;
                class9.aBoolean249 = class30_sub2_sub2.method408() == 1;
                class9.aBoolean242 = class30_sub2_sub2.method408() == 1;
                class9.aBoolean235 = class30_sub2_sub2.method408() == 1;
                class9.anInt231 = class30_sub2_sub2.method408();
                class9.anInt244 = class30_sub2_sub2.method408();
                class9.anIntArray215 = new int[20];
                class9.anIntArray247 = new int[20];
                class9.aClass30_Sub2_Sub1_Sub1Array209 = new Class30_Sub2_Sub1_Sub1[20];
                for(int i2 = 0; i2 < 20; i2++)
                {
                    int l3 = class30_sub2_sub2.method408();
                    if(l3 != 1)
                    {
                        continue;
                    }
                    class9.anIntArray215[i2] = class30_sub2_sub2.method411();
                    class9.anIntArray247[i2] = class30_sub2_sub2.method411();
                    String s1 = class30_sub2_sub2.method415();
                    if(class44_1 != null && s1.length() > 0)
                    {
                        int i5 = s1.lastIndexOf(",");
                        class9.aClass30_Sub2_Sub1_Sub1Array209[i2] = method207(Integer.parseInt(s1.substring(i5 + 1)), false, class44_1, s1.substring(0, i5));
                    }
                }

                class9.aStringArray225 = new String[5];
                for(int j2 = 0; j2 < 5; j2++)
                {
                    class9.aStringArray225[j2] = class30_sub2_sub2.method415();
                    if(class9.anInt236 == 3824)
                        class9.aStringArray225[4] = "Buy X";
                    if(class9.aStringArray225[j2].length() == 0)
                    {
                        class9.aStringArray225[j2] = null;
                    }
                }

            }
            if(class9.anInt262 == 3)
            {
                class9.aBoolean227 = class30_sub2_sub2.method408() == 1;
            }
            if(class9.anInt262 == 4 || class9.anInt262 == 1)
            {
                class9.aBoolean223 = class30_sub2_sub2.method408() == 1;
                int k2 = class30_sub2_sub2.method408();
                if(aclass30_sub2_sub1_sub4 != null)
                {
                    class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[k2];
                }
                class9.aBoolean268 = class30_sub2_sub2.method408() == 1;
            }
            if(class9.anInt262 == 4)
            {
                class9.aString248 = class30_sub2_sub2.method415();
                class9.aString228 = class30_sub2_sub2.method415();
            }
            if(class9.anInt262 == 1 || class9.anInt262 == 3 || class9.anInt262 == 4)
            {
                class9.anInt232 = class30_sub2_sub2.method413();
            }
            if(class9.anInt262 == 3 || class9.anInt262 == 4)
            {
                class9.anInt219 = class30_sub2_sub2.method413();
                class9.anInt216 = class30_sub2_sub2.method413();
                class9.anInt239 = class30_sub2_sub2.method413();
            }
            if(class9.anInt262 == 5)
            {
                String s = class30_sub2_sub2.method415();
                if(class44_1 != null && s.length() > 0)
                {
                    int i4 = s.lastIndexOf(",");
                    class9.aClass30_Sub2_Sub1_Sub1_207 = method207(Integer.parseInt(s.substring(i4 + 1)), false, class44_1, s.substring(0, i4));
                }
                s = class30_sub2_sub2.method415();
                if(class44_1 != null && s.length() > 0)
                {
                    int j4 = s.lastIndexOf(",");
                    class9.aClass30_Sub2_Sub1_Sub1_260 = method207(Integer.parseInt(s.substring(j4 + 1)), false, class44_1, s.substring(0, j4));
                }
            }
            if(class9.anInt262 == 6)
            {
                int l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                {
                    class9.anInt233 = 1;
                    class9.anInt234 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                }
                l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                {
                    class9.anInt255 = 1;
                    class9.anInt256 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                }
                l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                {
                    class9.anInt257 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                } else
                {
                    class9.anInt257 = -1;
                }
                l2 = class30_sub2_sub2.method408();
                if(l2 != 0)
                {
                    class9.anInt258 = (l2 - 1 << 8) + class30_sub2_sub2.method408();
                } else
                {
                    class9.anInt258 = -1;
                }
                class9.anInt269 = class30_sub2_sub2.method410();
                class9.anInt270 = class30_sub2_sub2.method410();
                class9.anInt271 = class30_sub2_sub2.method410();
            }
            if(class9.anInt262 == 7)
            {
                class9.anIntArray253 = new int[class9.anInt220 * class9.anInt267];
                class9.anIntArray252 = new int[class9.anInt220 * class9.anInt267];
                class9.aBoolean223 = class30_sub2_sub2.method408() == 1;
                int i3 = class30_sub2_sub2.method408();
                if(aclass30_sub2_sub1_sub4 != null)
                {
                    class9.aClass30_Sub2_Sub1_Sub4_243 = aclass30_sub2_sub1_sub4[i3];
                }
                class9.aBoolean268 = class30_sub2_sub2.method408() == 1;
                class9.anInt232 = class30_sub2_sub2.method413();
                class9.anInt231 = class30_sub2_sub2.method411();
                class9.anInt244 = class30_sub2_sub2.method411();
                class9.aBoolean249 = class30_sub2_sub2.method408() == 1;
                class9.aStringArray225 = new String[5];
                for(int k4 = 0; k4 < 5; k4++)
                {
                    class9.aStringArray225[k4] = class30_sub2_sub2.method415();
                    if(class9.aStringArray225[k4].length() == 0)
                    {
                        class9.aStringArray225[k4] = null;
                    }
                }

            }
            if(class9.anInt217 == 2 || class9.anInt262 == 2)
            {
                class9.aString222 = class30_sub2_sub2.method415();
                class9.aString218 = class30_sub2_sub2.method415();
                class9.anInt237 = class30_sub2_sub2.method410();
            }
			if(class9.anInt262 == 8) {	//	Loads new .dat files
			class9.aString248 = class30_sub2_sub2.method415();
			}

            if(class9.anInt217 == 1 || class9.anInt217 == 4 || class9.anInt217 == 5 || class9.anInt217 == 6)
            {
                class9.aString221 = class30_sub2_sub2.method415();
                if(class9.aString221.length() == 0)
                {
                    if(class9.anInt217 == 1)
                    {
                        class9.aString221 = "Ok";
                    }
                    if(class9.anInt217 == 4)
                    {
                        class9.aString221 = "Select";
                    }
                    if(class9.anInt217 == 5)
                    {
                        class9.aString221 = "Select";
                    }
                    if(class9.anInt217 == 6)
                    {
                        class9.aString221 = "Continue";
                    }
                }
            }
        } while(true);
	aClass44 = class44;
//editInventories();
Prayer(aclass30_sub2_sub1_sub4);
Curses(aclass30_sub2_sub1_sub4);
//questInterface(aclass30_sub2_sub1_sub4);
skilllevel(aclass30_sub2_sub1_sub4);
Bank();
pestcontrol2(aclass30_sub2_sub1_sub4);
harrysoptiontab(class44_1, aclass30_sub2_sub1_sub4);
Sidebar0(aclass30_sub2_sub1_sub4);
itemsOnDeathDATA(aclass30_sub2_sub1_sub4);
itemsOnDeath(aclass30_sub2_sub1_sub4);
Shop(aclass30_sub2_sub1_sub4);

Emote(class44_1, aclass30_sub2_sub1_sub4);
//getLunar(class44_1, aclass30_sub2_sub1_sub4);
Teleports(aclass30_sub2_sub1_sub4);
Starters(aclass30_sub2_sub1_sub4);
        EquipmentTab(aclass30_sub2_sub1_sub4);
        equipmentScreen(aclass30_sub2_sub1_sub4);
skillTab602();
        aClass12_238 = null;
        if(byte0 != -84);
    }

    private Model method206(int i, int j)
    {
        Model Model = (Model)aClass12_264.method222((i << 16) + j);
        if(Model != null)
        {
            return Model;
        }
        if(i == 1)
        {
            Model = Model.method462(anInt213, j);
        }
        if(i == 2)
        {
            Model = Class5.method159(j).method160(true);
        }
        if(i == 3)
        {
            Model = client.aClass30_Sub2_Sub4_Sub1_Sub2_1126.method453((byte)-41);
        }
        if(i == 4)
        {
            Model = Class8.method198(j).method202(50, true);
        }
        if(i == 5)
        {
            Model = null;
        }
        if(Model != null)
        {
            aClass12_264.method223(Model, (i << 16) + j, (byte)2);
        }
        return Model;
    }

    private static Class30_Sub2_Sub1_Sub1 method207(int i, boolean flag, Class44 class44, String s)
    {
        long l = (Class50.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_238.method222(l);
        if(class30_sub2_sub1_sub1 != null)
        {
            return class30_sub2_sub1_sub1;
        }
        try
        {
            class30_sub2_sub1_sub1 = new Class30_Sub2_Sub1_Sub1(class44, s, i);
            aClass12_238.method223(class30_sub2_sub1_sub1, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return class30_sub2_sub1_sub1;
    }

    public static void method208(int i, boolean flag, int j, Model Model)
    {
        if(flag)
        {
            return;
        }
        aClass12_264.method224();
        if(Model != null && j != 4)
        {
            aClass12_264.method223(Model, (j << 16) + i, (byte)2);
        }
    }

    public Model method209(int i, int j, int k, boolean flag)
    {
        Model Model;
        if(flag)
        {
            Model = method206(anInt255, anInt256);
        } else
        {
            Model = method206(anInt233, anInt234);
        }
        if(Model == null)
        {
            return null;
        }
        if(k == -1 && j == -1 && Model.anIntArray1640 == null)
        {
            return Model;
        }
        Model Model_1 = new Model(9, true, Class36.method532(k, false) & Class36.method532(j, false), false, Model);
        if(k != -1 || j != -1)
        {
            Model_1.method469((byte)-71);
        }
        if(k != -1)
        {
            Model_1.method470(k, 40542);
        }
        if(j != -1)
        {
            Model_1.method470(j, 40542);
        }
        Model_1.method479(84, 1000, -90, -580, -90, true);
        if(i != 0)
        {
            throw new NullPointerException();
        } else
        {
            return Model_1;
        }
    }

    public Class9()
    {
        anInt213 = 9;
        anInt229 = 891;
    }

}
