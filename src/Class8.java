import java.io.*;
import java.util.Arrays;


final class Class8 {



    public static final void method191(int i) {
        aClass12_159 = null;
        aClass12_158 = null;
        anIntArray195 = null;
        if(i >= 0)
            aBoolean187 = !aBoolean187;
        aClass8Array172 = null;
        aClass30_Sub2_Sub2_183 = null;
    }
	
                   

public static void dumpCfg() {
		boolean delete = (new File("item.cfg")).delete();
		for(int i = 0; i < 20000; i++) {
			Class8 class8 = method198(i);
			BufferedWriter bw = null;
			String des = "";
			if(class8.aByteArray178 != null)
			des = new String(class8.aByteArray178);
			else
			des = "Its a "+class8.aString170;
			try {
				BufferedWriter bufferedwriter;
				bufferedwriter = null;
				bufferedwriter = new BufferedWriter(new FileWriter("item.cfg", true));
				bufferedwriter.write((new StringBuilder()).append("item = ").append(i).append("	").append(class8.aString170).append("	").append(des).append("	").append(class8.anInt155).append("	").append(class8.anInt155).append("	").append(class8.anInt155).append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").toString());
				bufferedwriter.newLine();
				bufferedwriter.flush();
			} catch(Exception e) {
			}
		}
	}
	public static void dumpItemsList2() {
	for(int i = 0; i < 22321; i++) {
	Class8 class8 = method198(i);
	BufferedWriter bw = null;
	try {
	bw = new BufferedWriter(new FileWriter("ItemList2.txt", true));
	if(class8.aString170 != null) {
	bw.write(""+i+", ");
	bw.flush();
	bw.close();
	}
	} catch (IOException ioe2) {
	}
	}
}
	public static void dumpItemsList() {
	for(int i = 0; i < 22321; i++) {
	Class8 class8 = method198(i);
	BufferedWriter bw = null;
	try {
	bw = new BufferedWriter(new FileWriter("ItemList.txt", true));
	if(class8.aString170 != null) {
	bw.write("ID: "+i+"\t\tName: "+class8.aString170);
	bw.newLine();
	bw.flush();
	bw.close();
	}
	} catch (IOException ioe2) {
	}
	}
}
public static void dumpNewItems() {
for(int i = 9000; i < 25000; i++) {
Class8 class8 = method198(i);
BufferedWriter bw = null;
try {
bw = new BufferedWriter(new FileWriter("Item Dump.txt", true));
if(class8.aString170 != null) {
bw.write("<item members='true'  name='" + class8.aString170 + "'  type='"+i+"'> </item>");
bw.newLine();
bw.flush();
bw.close();
}
} catch (IOException ioe2) {
}
}
}

private int currentcolors;
    public final boolean method192(int i, int j) {
        if(i != -2836)
            aBoolean186 = !aBoolean186;
        int k = anInt175;
        int l = anInt166;
        if(j == 1)
        {
            k = anInt197;
            l = anInt173;
        }
        if(k == -1)
            return true;
        boolean flag = true;
        if(!Model.method463(k))
            flag = false;
        if(l != -1 && !Model.method463(l))
            flag = false;
        return flag;
    }

  //Start item dump
    public static void dumpItems() {
    for(int i = 0; i < anInt203; i++) {
    Class8 class8 = method198(i);
          BufferedWriter bw = null;

          try {
    	 class8.currentcolors = 0;
             bw = new BufferedWriter(new FileWriter("667itemdump.txt", true));

    	 bw.newLine();
    	 bw.write("	if(i == "+i+") //ID");
    	 bw.newLine();
    	 bw.write("		{");
    	 bw.newLine();
    	 bw.write("			class8.itemActions = new String[] {"+Arrays.toString(class8.aStringArray189)+"};");
    	 bw.newLine();
    	 bw.write("			class8.name = \""+class8.aString170+"\"; //Name");
    	 bw.newLine();
    	 bw.write("			class8.description = \"Its an "+class8.aString170+"\".getBytes(); //Description");
    	 bw.newLine();
                     if(class8.anIntArray156 != null) {
                         for(int i2 = 0; i2 < class8.anIntArray156.length; i2++) {
                             if(i2 == 0) {
                             }
                             if(i2 != class8.anIntArray156.length - 1) {                 
    		             class8.currentcolors += 1;
                             } else {   
    		             class8.currentcolors += 1;                         									if(class8.currentcolors != 0)
    	{
                     bw.write("			class8.modifiedModelColors = new int["+class8.currentcolors+"];");
                     bw.newLine();
                     bw.write("			class8.originalModelColors = new int["+class8.currentcolors+"];");
                     bw.newLine();
    	}				
    		             class8.currentcolors = 0;
                             }
                         }
                     }
                     if(class8.anIntArray156 != null) {
                         for(int i2 = 0; i2 < class8.anIntArray156.length; i2++) {
                             if(i2 == 0) {
                             }
                             if(i2 != class8.anIntArray156.length - 1) {                             	bw.write("			class8.modifiedModelColors["+class8.currentcolors+"] = " +class8.anIntArray156[i2]+";");
    		             class8.currentcolors += 1;
                                 bw.newLine();
                             } else {                            						bw.write("			class8.modifiedModelColors["+class8.currentcolors+"] = " +class8.anIntArray156[i2]+";");
    		             class8.currentcolors = 0;
                                 bw.newLine();
                             }
                         }
                     }
                     if(class8.anIntArray160 != null) {
                         for(int i2 = 0; i2 < class8.anIntArray160.length; i2++) {
                             if(i2 == 0) {
                             }
                             if(i2 != class8.anIntArray160.length - 1) {                             	bw.write("			class8.originalModelColors["+class8.currentcolors+"] = " +class8.anIntArray160[i2]+";");
    		             class8.currentcolors += 1;
                                 bw.newLine();
                             } else {                            						bw.write("			class8.originalModelColors["+class8.currentcolors+"] = " +class8.anIntArray160[i2]+";");
    		             class8.currentcolors = 0;
                                 bw.newLine();
                             }
                         }
                         if(class8.anIntArray201 != null) {
                             for(int i2 = 0; i2 < class8.anIntArray201.length; i2++) {
                                 if(i2 == 0) {
                                 }
                                 if(i2 != class8.anIntArray201.length - 1) {                 
        		             class8.currentcolors += 1;
                                 } else {   
        		             class8.currentcolors += 1;                         									if(class8.currentcolors != 0)
        	{
                         bw.write("			class8.modifiedModelColors = new int["+class8.currentcolors+"];");
                         bw.newLine();
                         bw.write("			class8.originalModelColors = new int["+class8.currentcolors+"];");
                         bw.newLine();
        	}				
        		             class8.currentcolors = 0;
                                 }
                             }
                         }
                         if(class8.anIntArray201 != null) {
                             for(int i2 = 0; i2 < class8.anIntArray201.length; i2++) {
                                 if(i2 == 0) {
                                 }
                                 if(i2 != class8.anIntArray201.length - 1) {                             	bw.write("			class8.anIntArray201["+class8.currentcolors+"] = " +class8.anIntArray201[i2]+";");
        		             class8.currentcolors += 1;
                                     bw.newLine();
                                 } else {                            						bw.write("			class8.anIntArray201["+class8.currentcolors+"] = " +class8.anIntArray201[i2]+";");
        		             class8.currentcolors = 0;
                                     bw.newLine();
                                 }
                             }
                         }
                         if(class8.anIntArray193 != null) {
                             for(int i2 = 0; i2 < class8.anIntArray193.length; i2++) {
                                 if(i2 == 0) {
                                 }
                                 if(i2 != class8.anIntArray193.length - 1) {                             	bw.write("			class8.anIntArray193["+class8.currentcolors+"] = " +class8.anIntArray193[i2]+";");
        		             class8.currentcolors += 1;
                                     bw.newLine();
                                 } else {                            						bw.write("			class8.anIntArray193["+class8.currentcolors+"] = " +class8.anIntArray193[i2]+";");
        		             class8.currentcolors = 0;
                                     bw.newLine();
                                 }
                             }
                         }
                     }
                     bw.write("			class8.modelId = "+class8.anInt174+";");
                     bw.newLine();
                     bw.write("			class8.spriteScale = "+class8.anInt181+";");
                     bw.newLine();
                     bw.write("			class8.spritePitch = "+class8.anInt190+";");
                     bw.newLine();
                     bw.write("			class8.spriteCameraRoll = "+class8.anInt198+";");
                     bw.newLine();
                     bw.write("			class8.spriteCameraYaw = "+class8.anInt204+";");
                     bw.newLine();
                     bw.write("			class8.spriteTranslateX = "+class8.anInt169+";");
                     bw.newLine();
                     bw.write("			class8.spriteTranslateY = "+class8.anInt194+";");
                     bw.newLine();
                     bw.write("			class8.primaryMaleModel = "+class8.anInt165+";");
                     bw.newLine();
                     bw.write("			class8.primaryFemaleModel = "+class8.anInt200+";");
                     bw.newLine();
                     bw.write("			class8.secondaryMaleModel = "+class8.anInt188+";");
                     bw.newLine();
                     bw.write("			class8.secondaryFemaleModel = "+class8.anInt164+";");
                     bw.newLine();
                     bw.write("			class8.primaryMaleHeadPiece = "+class8.anInt175+";");
                     bw.newLine();
                     bw.write("			class8.primaryFemaleHeadPiece = "+class8.anInt197+";");
                     bw.newLine();
                     bw.write("		}");
                     bw.newLine();
                     bw.newLine();
    	 bw.flush();
          } catch (IOException ioe) {
    	 ioe.printStackTrace();
          } finally {
    	 if (bw != null) try {
    	    bw.close();
    	 } catch (IOException ioe2) {
    	 }
          }
    }
    }
    //End item dump

    public static final void method193(Class44 class44) {
        aClass30_Sub2_Sub2_183 = new Stream(class44.method571("obj.dat", null), 891);
        Stream class30_sub2_sub2 = new Stream(class44.method571("obj.idx", null), 891);
        anInt203 = class30_sub2_sub2.method410();
        anIntArray195 = new int[anInt203+400000];
        int i = 2;
        for(int j = 0; j < anInt203; j++)
        {
            anIntArray195[j] = i;
            i += class30_sub2_sub2.method410();
        }

        aClass8Array172 = new Class8[10];
        for(int k = 0; k < 10; k++)
            aClass8Array172[k] = new Class8();
       // dumpItems();
        }

    public final Model method194(int i, int j) {
        while(i >= 0)
            aBoolean186 = !aBoolean186;
        int k = anInt175;
        int l = anInt166;
        if(j == 1) {
            k = anInt197;
            l = anInt173;
        }
        if(k == -1)
            return null;
        Model model = Model.method462(anInt171, k);
        if(l != -1) {
            Model Model_1 = Model.method462(anInt171, l);
            Model aModel[] = {
                model, Model_1
            };
            model = new Model(2, aModel, -38);
        }
        if(anIntArray156 != null) {
            for(int i1 = 0; i1 < anIntArray156.length; i1++)
                model.method476(anIntArray156[i1], anIntArray160[i1]);

        }
        return model;
    }

    public final boolean method195(int i, int j) {
        if(i != 40903)
            aBoolean206 = !aBoolean206;
        int k = anInt165;
        int l = anInt188;
        int i1 = anInt185;
        if(j == 1) {
            k = anInt200;
            l = anInt164;
            i1 = anInt162;
        }
        if(k == -1)
            return true;
        boolean flag = true;
        if(!Model.method463(k))
            flag = false;
        if(l != -1 && !Model.method463(l))
            flag = false;
        if(i1 != -1 && !Model.method463(i1))
            flag = false;
        return flag;
    }

    public final Model method196(boolean flag, int i) {
        if(flag)
            throw new NullPointerException();
        int j = anInt165;
        int k = anInt188;
        int l = anInt185;
        if(i == 1) {
            j = anInt200;
            k = anInt164;
            l = anInt162;
        }
        if(j == -1)
            return null;
        Model model = Model.method462(anInt171, j);
        if(k != -1)
            if(l != -1) {
                Model Model_1 = Model.method462(anInt171, k);
                Model Model_3 = Model.method462(anInt171, l);
                Model aModel_1[] = {
                    model, Model_1, Model_3
                };
                model = new Model(3, aModel_1, -38);
            } else {
                Model Model_2 = Model.method462(anInt171, k);
                Model aModel[] = {
                    model, Model_2
                };
                model = new Model(2, aModel, -38);
            }
        if(i == 0 && aByte205 != 0)
            model.method475(0, aByte205, 16384, 0);
        if(i == 1 && aByte154 != 0)
            model.method475(0, aByte154, 16384, 0);
        if(anIntArray156 != null) {
            for(int i1 = 0; i1 < anIntArray156.length; i1++)
                model.method476(anIntArray156[i1], anIntArray160[i1]);

        }
        return model;
    }

    public final void method197()
    {
        anInt174 = 0;
        aString170 = null;
        aByteArray178 = null;
        anIntArray156 = null;
        anIntArray160 = null;
        anInt181 = 2000;
        anInt190 = 0;
        anInt198 = 0;
        anInt204 = 0;
        anInt169 = 0;
        anInt194 = 0;
        anInt199 = -1;
        aBoolean176 = false;
        anInt155 = 1;
        aBoolean161 = false;
        aStringArray168 = null;
        aStringArray189 = null;
        anInt165 = -1;
        anInt188 = -1;
        aByte205 = 0;
        anInt200 = -1;
        anInt164 = -1;
        aByte154 = 0;
        anInt185 = -1;
        anInt162 = -1;
        anInt175 = -1;
        anInt166 = -1;
        anInt197 = -1;
        anInt173 = -1;
        anIntArray193 = null;
        anIntArray201 = null;
        anInt179 = -1;
        anInt163 = -1;
        anInt167 = 128;
        anInt192 = 128;
        anInt191 = 128;
        anInt196 = 0;
        anInt184 = 0;
        anInt202 = 0;
    }

    public static final Class8 method198(int i)
    {
        for(int j = 0; j < 10; j++)
            if(aClass8Array172[j].anInt157 == i)
                return aClass8Array172[j];

        anInt180 = (anInt180 + 1) % 10;
        Class8 class8 = aClass8Array172[anInt180];
        aClass30_Sub2_Sub2_183.anInt1406 = anIntArray195[i];
        class8.anInt157 = i;
        class8.method197();
        class8.method203(true, aClass30_Sub2_Sub2_183);
	class8.method198_2(i, class8);


        if(class8.anInt163 != -1)
            class8.method199((byte)61);
        if(!aBoolean182 && class8.aBoolean161)
        {
            class8.aString170 = "Members Object";
            class8.aByteArray178 = "Login to a members' server to use this object.".getBytes();
            class8.aStringArray168 = null;
            class8.aStringArray189 = null;
            class8.anInt202 = 0;
        }
if (class8.anInt157 == i &&  class8.anIntArray156 == null) {
			 class8.anIntArray156 = new int [1];
			class8.anIntArray160 = new int [1];
			 class8.anIntArray156[0] = 0;
			class8.anIntArray160[0] = 1;
		}
if (class8.anIntArray156 != null) {
			for (int i2 = 0; i2 < class8.anIntArray156.length; i2++) {
				if (class8.anIntArray160[i2] == 0) {
					class8.anIntArray160[i2] = 1;
				}
			}
		}

        if(i == 4153)
        {
class8.anInt174 = 5413;
class8.anInt181 = 2000;
class8.anInt190 = 308;
class8.anInt198 = 36;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 17;
class8.anInt165 = 5410;
class8.anInt200 = 5410;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
        }
        if(i == 9013)
        {
class8.anInt174 = 15909;
class8.anInt181 = 2000;
class8.anInt190 = 276;
class8.anInt198 = 1550;
class8.anInt204 = 0;
class8.anInt169 = -3;
class8.anInt194 = 77;
class8.anInt165 = 15942;
class8.anInt200 = 15942;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
        }
if(i == 4211)
	{
class8.anInt174 = 5194;
class8.anInt181 = 2000;
class8.anInt190 = 0;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 0;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 22320){
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wear";
	class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int [1];
      //Purple: 926-127
        class8.anIntArray156[0] = 926;
        class8.anIntArray160[0] = 128;
	class8.anInt174 = 2635;//Item Look
	class8.anInt181 = 440;
	class8.anInt190 = 76;
	class8.anInt198 = 1850;
	class8.anInt204 = 0;
        class8.anInt169 = 1;
        class8.anInt194 = 1;
        class8.anInt165 = 187;
	class8.anInt200 = 363;
	class8.anInt175 = 29;
	class8.anInt197 = 87;
	class8.aString170 = "Black Party Hat";
	class8.aByteArray178 = "A nice hat from a cracker.".getBytes();
        }

if(i == 22321)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 51136;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Purple santa hat ";
            class8.aByteArray178 = "Purple santa hat.".getBytes();
        }
        if(i == 22322)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 35321;
            class8.anIntArray156[1] = 35321;
            class8.anIntArray160[1] = 35321;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "sky santa hat ";
            class8.aByteArray178 = "Sky santa hat.".getBytes();
        }
if(i == 22323)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 6;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Black santa hat ";
            class8.aByteArray178 = "Black santa hat.".getBytes();
        }

if(i == 22324)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43297;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Mithril santa hat ";
            class8.aByteArray178 = "Mithril santa hat.".getBytes();
        }

 if(i == 22325)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 36133;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Rune santa hat ";
            class8.aByteArray178 = "Rune santa hat.".getBytes();
        }

        if(i == 24568)
        {
            Jukkyname("Mod sgs Platebody", "Made By Mod Sgsrocks From Godzhell.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            Jukkycolors(61, 32465, 0);
            Jukkycolors(24, 64449, 1);
            Jukkycolors(41, 32465, 2);
            Jukkycolors(10394, 32465, 3);
            Jukkycolors(10518, 64449, 4);
            Jukkycolors(10388, 64449, 5);
            Jukkycolors(10514, 64449, 6);
            Jukkycolors(10508, 64449, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 24569)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 32465;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 64449;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Sgs Platelegs";
            class8.aByteArray178 = "Made By Mod Sgsrocks From Godzhell.".getBytes();
        }
        if(i == 24570)
        {
            Jukkyname("Mod Sgs Platebody V.2", "Made By Mod Sgsrocks From Godzhell.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            Jukkycolors(61, 47009, 0);
            Jukkycolors(24, 64162, 1);
            Jukkycolors(41, 47009, 2);
            Jukkycolors(10394, 47009, 3);
            Jukkycolors(10518, 64162, 4);
            Jukkycolors(10388, 64162, 5);
            Jukkycolors(10514, 64162, 6);
            Jukkycolors(10508, 64162, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 24571)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 47009;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 64162;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Sgs Platelegs V.2";
            class8.aByteArray178 = "Made By Mod Sgsrocks From Godzhell.".getBytes();
        }
        if(i == 24572)
        {
            Jukkyname("Seahawks Platebody", "Ka Kaw!");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            Jukkycolors(61, 41745, 0);
            Jukkycolors(24, 20396, 1);
            Jukkycolors(41, 41745, 2);
            Jukkycolors(10394, 41745, 3);
            Jukkycolors(10518, 20396, 4);
            Jukkycolors(10388, 20396, 5);
            Jukkycolors(10514, 20396, 6);
            Jukkycolors(10508, 20396, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 24573)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 41745;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 20396;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Seahawks Platelegs";
            class8.aByteArray178 = "Ka Kaw!".getBytes();
        }


        if(i == 22326)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 1000;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Dragon santa hat ";
            class8.aByteArray178 = "Dragon santa hat.".getBytes();
        }

        if(i == 22327)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 21662 ;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Addy santa hat ";
            class8.aByteArray178 = "Addy santa hat.".getBytes();
        }

        if(i == 22328)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 7114;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Gold santa hat ";
            class8.aByteArray178 = "Gold santa hat.".getBytes();
        }

        if(i == 22329)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 10394;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Barrows santa hat ";
            class8.aByteArray178 = "Barrows santa hat.".getBytes();
        }

        if(i == 22330)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43968;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.aString170 = "Blue santa hat ";
            class8.aByteArray178 = "Blue santa hat.".getBytes();
        }
        if(i == 22331)
        {
            Jukkyname("Mod Platebody", "A moderator platebody.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            Jukkycolors(61, 63, 0);
            Jukkycolors(24, 6073, 1);
            Jukkycolors(41, 63, 2);
            Jukkycolors(10394, 63, 3);
            Jukkycolors(10518, 6073, 4);
            Jukkycolors(10388, 6073, 5);
            Jukkycolors(10514, 6073, 6);
            Jukkycolors(10508, 6073, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 22332)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 63;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 6073;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Platelegs";
            class8.aByteArray178 = "A set of moderators platelegs.".getBytes();
        }
        if(i == 22333)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 63;
            class8.anInt174 = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Boots";
            class8.aByteArray178 = "Mod boots".getBytes();
        }
        if(i == 26595)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            //class8.anIntArray156 = new int[4];
           // class8.anIntArray160 = new int[4];
            //class8.anIntArray156[0] = 61;
            //class8.anIntArray160[0] = 63;
            class8.anInt174 = 82768;
            class8.anInt181 = 1118;
            class8.anInt190 = 229;
            class8.anInt198 = 485;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -47;
            class8.anInt165 = 82860;
            class8.anInt200 = 82860;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Drygore Mace";
            class8.aByteArray178 = "A mace created using kalphite body parts.".getBytes();
        }
        if(i == 26599)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            //class8.anIntArray156 = new int[4];
           // class8.anIntArray160 = new int[4];
            //class8.anIntArray156[0] = 61;
            //class8.anIntArray160[0] = 63;
            class8.anInt174 = 82768;
            class8.anInt181 = 1118;
            class8.anInt190 = 304;
            class8.anInt198 = 1508;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 11;
            class8.anInt165 = 82861;
            class8.anInt200 = 82861;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Off-hand Drygore Mace";
            class8.aByteArray178 = "A mace created using kalphite body parts.".getBytes();
        }
        if(i == 26579)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            //class8.anIntArray156 = new int[4];
           // class8.anIntArray160 = new int[4];
            //class8.anIntArray156[0] = 61;
            //class8.anIntArray160[0] = 63;
            class8.anInt174 = 82763;
            class8.anInt181 = 1053;
            class8.anInt190 = 228;
            class8.anInt198 = 458;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -47;
            class8.anInt165 = 82856;
            class8.anInt200 = 82856;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Drygore rapier";
            class8.aByteArray178 = "A rapier created using kalphite body parts.".getBytes();
        }
        if(i == 27069)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            //class8.anIntArray156 = new int[4];
           // class8.anIntArray160 = new int[4];
            //class8.anIntArray156[0] = 61;
            //class8.anIntArray160[0] = 63;
            class8.anInt174 = 82868;
            class8.anInt181 = 987;
            class8.anInt190 = 207;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 82865;
            class8.anInt200 = 82865;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Chaotic claw";
            class8.aByteArray178 = "Its an Chaotic claw.".getBytes();
        }
        if(i == 27071)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            //class8.anIntArray156 = new int[4];
           // class8.anIntArray160 = new int[4];
            //class8.anIntArray156[0] = 61;
            //class8.anIntArray160[0] = 63;
            class8.anInt174 = 82868;
            class8.anInt181 = 987;
            class8.anInt190 = 207;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 82867;
            class8.anInt200 = 82867;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Off-hand chaotic claw";
            class8.aByteArray178 = "Its an Off-hand chaotic claw.".getBytes();
        }
        if(i == 22334)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 63;
            class8.anIntArray156[1] = 57;
            class8.anIntArray160[1] = 63;
            class8.anIntArray156[2] = 7054;
            class8.anIntArray160[2] = 6073;
            class8.anInt174 = 2339;
            class8.anInt181 = 1560;
            class8.anInt190 = 344;
            class8.anInt198 = 1104;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = -14;
            class8.anInt165 = 486;
            class8.anInt200 = 486;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Kiteshield";
            class8.aByteArray178 = "It's an moderator kiteshield.".getBytes();
        }
        if(i == 22335)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 8128;
            class8.anIntArray156[1] = 41;
            class8.anIntArray160[1] = 38676;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[2] = 38676;
            class8.anIntArray156[3] = 25238;
            class8.anIntArray160[3] = 8128;
            class8.anInt174 = 4208;
            class8.anInt181 = 1100;
            class8.anInt190 = 620;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = 5;
            class8.anInt165 = 4206;
            class8.anInt200 = 4207;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Admin Plateskirt";
            class8.aByteArray178 = "It's an admin skirt".getBytes();
        }
        if(i == 22336)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 63;
            class8.anIntArray156[1] = 41;
            class8.anIntArray160[1] = 6073;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[2] = 6073;
            class8.anIntArray156[3] = 25238;
            class8.anIntArray160[3] = 63;
            class8.anInt174 = 4208;
            class8.anInt181 = 1100;
            class8.anInt190 = 620;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = 5;
            class8.anInt165 = 4206;
            class8.anInt200 = 4207;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Plateskirt";
            class8.aByteArray178 = "It's a mod skirt".getBytes();
        }
        if(i == 22337)
        {
            Jukkyname("Owners Platebody", "An owners platebody.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            Jukkycolors(61, 0, 0);
            Jukkycolors(24, 950, 1);
            Jukkycolors(41, 0, 2);
            Jukkycolors(10394, 0, 3);
            Jukkycolors(10518, 950, 4);
            Jukkycolors(10388, 950, 5);
            Jukkycolors(10514, 950, 6);
            Jukkycolors(10508, 950, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 22338)
        {
            NEO("Owners Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 950, 0);
            NewColor(8128, 0, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 22339)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 8128;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 38676;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Admin Platelegs";
            class8.aByteArray178 = "A set of administrators platelegs.".getBytes();
        }
        if(i == 22340)
        {
            Jukkyname("Admin Platebody", "An administrators platebody.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            Jukkycolors(61, 8128, 0);
            Jukkycolors(24, 38676, 1);
            Jukkycolors(41, 8128, 2);
            Jukkycolors(10394, 8128, 3);
            Jukkycolors(10518, 38676, 4);
            Jukkycolors(10388, 38676, 5);
            Jukkycolors(10514, 38676, 6);
            Jukkycolors(10508, 38676, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 22341)
        {
            NEO("Admin Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            NewColor(945, 38676, 0);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 22342)
        {
            NEO("G-mod Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 22412, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 22343)
        {
            NEO("Mod Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 6073, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 22344)
        {
            NEO("SB-mod Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 128, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 22345)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 38676;
            class8.anInt174 = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Admin Boots";
            class8.aByteArray178 = "Admin boots".getBytes();
        }
        if(i == 22346)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 8128;
            class8.anIntArray156[1] = 57;
            class8.anIntArray160[1] = 8128;
            class8.anIntArray156[2] = 7054;
            class8.anIntArray160[2] = 38676;
            class8.anInt174 = 2339;
            class8.anInt181 = 1560;
            class8.anInt190 = 344;
            class8.anInt198 = 1104;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = -14;
            class8.anInt165 = 486;
            class8.anInt200 = 486;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Admin Kiteshield";
            class8.aByteArray178 = "It's an administrator kiteshield.".getBytes();
        }
        if(i == 22347)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 7114;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7114;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Golden Bunny ears";
            class8.aByteArray178 = "Golden Bunny ears".getBytes();
        }
        if(i == 22348)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43968;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 43968;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Blue Bunny ears";
            class8.aByteArray178 = "Its a Blue Bunny ears".getBytes();
        }
        if(i == 22349)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 950;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 950;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Red Bunny ears";
            class8.aByteArray178 = "Its a Red Bunny ears".getBytes();
        }
        if(i == 22350)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 51136;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 51136;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Purple Bunny ears";
            class8.aByteArray178 = "Its a Purple Bunny ears".getBytes();
        }
        if(i == 22351)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 22464;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 22464;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Green Bunny ears";
            class8.aByteArray178 = "Its a Green Bunny ears".getBytes();
        }
        if(i == 22352)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 6073;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 6073;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Orange Bunny ears";
            class8.aByteArray178 = "Its a Orange Bunny ears".getBytes();
        }
        if(i == 22353)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 10394;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 10394;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Barrows Bunny ears";
            class8.aByteArray178 = "Its A Barrows Bunny ears".getBytes();
        }
        if(i == 22354)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 926;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 926;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Dragon Bunny ears";
            class8.aByteArray178 = "Its A Dragon Bunny ears".getBytes();
        }
        if(i == 22355)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 5652;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 5652;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Bronze Bunny ears";
            class8.aByteArray178 = "Its A Bronze Bunny ears".getBytes();
        }
        if(i == 22356)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 33;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 33;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Iron Bunny ears";
            class8.aByteArray178 = "Its A Iron Bunny ears".getBytes();
        }
        if(i == 22357)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43072;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 43072;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Steel Bunny ears";
            class8.aByteArray178 = "Its A Steel Bunny ears".getBytes();
        }
        if(i == 22358)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 8;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 8;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Black Bunny ears";
            class8.aByteArray178 = "Its A Black Bunny ears".getBytes();
        }
        if(i == 22359)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43297;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 43297;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Mith Bunny ears";
            class8.aByteArray178 = "Its A Mith Bunny ears".getBytes();
        }
        if(i == 22360)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 36133;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 36133;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Rune Bunny ears";
            class8.aByteArray178 = "Its A Rune Bunny ears".getBytes();
        }
        if(i == 22361)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 21662;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 21662;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Adam Bunny ears";
            class8.aByteArray178 = "Its A Adam Bunny ears".getBytes();
        }
        if(i == 22362)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 6069;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 6069;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Lava Bunny ears";
            class8.aByteArray178 = "Its A lava Bunny ears".getBytes();
        }

        if(i == 22363)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 26706;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 26706;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Ivandis Bunny ears";
            class8.aByteArray178 = "Its A Ivandis Bunny ears".getBytes();
        }
        if(i == 22364)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 62920;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 62920;
	    class8.anInt174 = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.aString170 = "Ladies Bunny ears";
            class8.aByteArray178 = "Its A Ladies Bunny ears".getBytes();
        }

        return class8;
    }

 public static Class8 method198_2(int i, Class8 class8)
{
    return class8;
}

    public static void Models(int i, int j, int k)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.anInt174 = i;
        class8.anInt165 = j;
        class8.anInt200 = k;
    }

    public static void NewColor(int i, int j, int k)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.anIntArray156[k] = i;
        class8.anIntArray160[k] = j;
    }

    public static void NEO(String s, String s1, String s2)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.aStringArray189 = new String[5];
        class8.aStringArray189[1] = s2;
        class8.aString170 = s;
        class8.aByteArray178 = s1.getBytes();
    }

    public static void Zoom(int i, int j, int k, int l, int i1, boolean flag)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.anInt181 = i;
        class8.anInt190 = l;
        class8.anInt198 = i1;
        class8.anInt169 = k;
        class8.anInt194 = j;
        class8.aBoolean176 = flag;
    }

    public static void Jukkycolors(int i, int j, int k)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.anIntArray156[k] = i;
        class8.anIntArray160[k] = j;
    }

    public static void Jukkyzoom(int i, int j, int k, int l, int i1, int j1, int k1, int l1, 
            boolean flag)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.anInt181 = i;
        class8.anInt190 = j;
        class8.anInt198 = k;
        class8.anInt204 = l;
        class8.anInt169 = i1;
        class8.anInt194 = j1;
        class8.aBoolean176 = flag;
        class8.anInt175 = k1;
        class8.anInt197 = l1;
    }

    public static void Jukkyname(String s, String s1)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.aStringArray189 = new String[5];
        class8.aStringArray189[1] = "Wear";
        class8.aString170 = s;
        class8.aByteArray178 = s1.getBytes();
    }

    public static void JukkyModels(int i, int j, int k, int l, int i1)
    {
        Class8 class8 = aClass8Array172[anInt180];
        class8.anInt165 = i;
        class8.anInt188 = j;
        class8.anInt200 = k;
        class8.anInt164 = l;
        class8.anInt174 = i1;
    }

	public void itemConfigs(String WearOption, String Name, String Examine, int Invent, int Male, int Female, int FemaleSleeve, int MaleSleeve,
		int ModelZoom, int ModelOffset1, int ModelOffset2, int Rotation1, int Rotation2) {
			aStringArray189 = new String[5];
			aStringArray189[1] = WearOption;
			anInt174 = Invent;
			anInt165 = Male;
			anInt200 = Female;
			anInt188 = FemaleSleeve;
			anInt164 = MaleSleeve;
			anInt181 = ModelZoom;
			anInt169 = ModelOffset1;
			anInt194 = ModelOffset2;
			anInt190 = Rotation1;
			anInt198 = Rotation2;
			aString170 = Name;
			aByteArray178 = Examine.getBytes();
		}

    public void method199(byte byte0)
    {
        Class8 class8 = method198(anInt163);
        anInt174 = class8.anInt174;
        anInt181 = class8.anInt181;
        anInt190 = class8.anInt190;
        anInt198 = class8.anInt198;
        anInt204 = class8.anInt204;
        anInt169 = class8.anInt169;
        anInt194 = class8.anInt194;
        if(byte0 != 61)
            aBoolean186 = !aBoolean186;
        anIntArray156 = class8.anIntArray156;
        anIntArray160 = class8.anIntArray160;
        Class8 class8_1 = method198(anInt179);
        aString170 = class8_1.aString170;
        aBoolean161 = class8_1.aBoolean161;
        anInt155 = class8_1.anInt155;
        String s = "a";
        char c = class8_1.aString170.charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            s = "an";
        aByteArray178 = ("Swap this note at any bank for " + s + " " + class8_1.aString170 + ".").getBytes();
        aBoolean176 = true;
    }

    public static final Class30_Sub2_Sub1_Sub1 method200(int i, int j, int k, int l)
    {
        if(k == 0)
        {
            Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_158.method222(i);
            if(class30_sub2_sub1_sub1 != null && class30_sub2_sub1_sub1.anInt1445 != j && class30_sub2_sub1_sub1.anInt1445 != -1)
            {
                class30_sub2_sub1_sub1.method329();
                class30_sub2_sub1_sub1 = null;
            }
            if(class30_sub2_sub1_sub1 != null)
                return class30_sub2_sub1_sub1;
        }
        Class8 class8 = method198(i);
    	class8 = method198_2(i, class8);
        if(class8.anIntArray193 == null)
            j = -1;
        if(j > 1)
        {
            int i1 = -1;
            for(int j1 = 0; j1 < 10; j1++)
                if(j >= class8.anIntArray201[j1] && class8.anIntArray201[j1] != 0)
                    i1 = class8.anIntArray193[j1];

            if(i1 != -1)
                class8 = method198(i1);
		class8 = method198_2(i, class8);
        }
        Model Model = class8.method201(1);
        if(Model == null)
            return null;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1_2 = null;
        if(class8.anInt163 != -1)
        {
            class30_sub2_sub1_sub1_2 = method200(class8.anInt179, 10, -1, 9);
            if(class30_sub2_sub1_sub1_2 == null)
                return null;
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1_1 = new Class30_Sub2_Sub1_Sub1(32, 32);
        int k1 = Class30_Sub2_Sub1_Sub3.anInt1466;
        int l1 = Class30_Sub2_Sub1_Sub3.anInt1467;
        int ai[] = Class30_Sub2_Sub1_Sub3.anIntArray1472;
        int ai1[] = Class30_Sub2_Sub1.anIntArray1378;
        int i2 = Class30_Sub2_Sub1.anInt1379;
        int j2 = Class30_Sub2_Sub1.anInt1380;
        int k2 = Class30_Sub2_Sub1.anInt1383;
        int l2 = Class30_Sub2_Sub1.anInt1384;
        int i3 = Class30_Sub2_Sub1.anInt1381;
        int j3 = Class30_Sub2_Sub1.anInt1382;
        Class30_Sub2_Sub1_Sub3.aBoolean1464 = false;
        Class30_Sub2_Sub1.method331(32, 32, -293, class30_sub2_sub1_sub1_1.anIntArray1439);
        Class30_Sub2_Sub1.method336(32, 0, 0, 0, 32, 0);
        Class30_Sub2_Sub1_Sub3.method364((byte)6);
        int k3 = class8.anInt181;
        if(k == -1)
            k3 = (int)((double)k3 * 1.5D);
        if(k > 0)
            k3 = (int)((double)k3 * 1.04D);
        int l3 = Class30_Sub2_Sub1_Sub3.anIntArray1470[class8.anInt190] * k3 >> 16;
        int i4 = Class30_Sub2_Sub1_Sub3.anIntArray1471[class8.anInt190] * k3 >> 16;
        Model.method482(0, class8.anInt198, class8.anInt204, class8.anInt190, class8.anInt169, l3 + ((Class30_Sub2_Sub4) (Model)).anInt1426 / 2 + class8.anInt194, i4 + class8.anInt194);
        for(int i5 = 31; i5 >= 0; i5--)
        {
            for(int j4 = 31; j4 >= 0; j4--)
                if(class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] == 0)
                    if(i5 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[(i5 - 1) + j4 * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;
                    else
                    if(j4 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[i5 + (j4 - 1) * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;
                    else
                    if(i5 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[i5 + 1 + j4 * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;
                    else
                    if(j4 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[i5 + (j4 + 1) * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;

        }

        if(k > 0)
        {
            for(int j5 = 31; j5 >= 0; j5--)
            {
                for(int k4 = 31; k4 >= 0; k4--)
                    if(class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] == 0)
                        if(j5 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[(j5 - 1) + k4 * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;
                        else
                        if(k4 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[j5 + (k4 - 1) * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;
                        else
                        if(j5 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[j5 + 1 + k4 * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;
                        else
                        if(k4 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[j5 + (k4 + 1) * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;

            }

        } else
        if(k == 0)
        {
            for(int k5 = 31; k5 >= 0; k5--)
            {
                for(int l4 = 31; l4 >= 0; l4--)
                    if(class30_sub2_sub1_sub1_1.anIntArray1439[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[(k5 - 1) + (l4 - 1) * 32] > 0)
                        class30_sub2_sub1_sub1_1.anIntArray1439[k5 + l4 * 32] = 0x302020;

            }

        }
        if(class8.anInt163 != -1)
        {
            int l5 = class30_sub2_sub1_sub1_2.anInt1444;
            int j6 = class30_sub2_sub1_sub1_2.anInt1445;
            class30_sub2_sub1_sub1_2.anInt1444 = 32;
            class30_sub2_sub1_sub1_2.anInt1445 = 32;
            class30_sub2_sub1_sub1_2.method348(0, 16083, 0);
            class30_sub2_sub1_sub1_2.anInt1444 = l5;
            class30_sub2_sub1_sub1_2.anInt1445 = j6;
        }
        if(k == 0)
            aClass12_158.method223(class30_sub2_sub1_sub1_1, i, (byte)2);
        Class30_Sub2_Sub1.method331(j2, i2, -293, ai1);
        Class30_Sub2_Sub1.method333(j3, k2, false, l2, i3);
        Class30_Sub2_Sub1_Sub3.anInt1466 = k1;
        Class30_Sub2_Sub1_Sub3.anInt1467 = l1;
        Class30_Sub2_Sub1_Sub3.anIntArray1472 = ai;
        Class30_Sub2_Sub1_Sub3.aBoolean1464 = true;
        if(l < 9 || l > 9)
        {
            for(int i6 = 1; i6 > 0; i6++);
        }
        if(class8.aBoolean176)
            class30_sub2_sub1_sub1_1.anInt1444 = 33;
        else
            class30_sub2_sub1_sub1_1.anInt1444 = 32;
        class30_sub2_sub1_sub1_1.anInt1445 = j;
        return class30_sub2_sub1_sub1_1;
    }

    public final Model method201(int i)
    {
        if(anIntArray193 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
                if(i >= anIntArray201[k] && anIntArray201[k] != 0)
                    j = anIntArray193[k];

            if(j != -1)
                return method198(j).method201(1);
        }
        Model Model = (Model)aClass12_159.method222(anInt157);
        if(Model != null)
            return Model;
        Model = Model.method462(anInt171, anInt174);
        if(Model == null)
            return null;
        if(anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
            Model.method478(anInt167, anInt191, anInt177, anInt192);
        if(anIntArray156 != null)
        {
            for(int l = 0; l < anIntArray156.length; l++)
                Model.method476(anIntArray156[l], anIntArray160[l]);

        }
        Model.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true);
        Model.aBoolean1659 = true;
        aClass12_159.method223(Model, anInt157, (byte)2);
        return Model;
    }

    public final Model method202(int i, boolean flag)
    {
        if(anIntArray193 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
                if(i >= anIntArray201[k] && anIntArray201[k] != 0)
                    j = anIntArray193[k];

            if(j != -1)
                return method198(j).method202(1, true);
        }
        Model model = Model.method462(anInt171, anInt174);
        if(!flag)
            throw new NullPointerException();
        if(model == null)
            return null;
        if(anIntArray156 != null)
        {
            for(int l = 0; l < anIntArray156.length; l++)
                model.method476(anIntArray156[l], anIntArray160[l]);

        }
        return model;
    }

private void method203(boolean flag, Stream class30_sub2_sub2)
	{
		do
		{
			int i = class30_sub2_sub2.method408();
			if(i == 0)
				return;
			if(i == 1)
				anInt174 = class30_sub2_sub2.method410();
			else
			if(i == 2)
				aString170 = class30_sub2_sub2.method415();
			else
			if(i == 3)
				aByteArray178 =  class30_sub2_sub2.method416((byte)30);
			else
			if(i == 4)
				anInt181 = class30_sub2_sub2.method410();
			else
			if(i == 5)
				anInt190 = class30_sub2_sub2.method410();
			else
			if(i == 6)
				anInt198 = class30_sub2_sub2.method410();
			else
			if(i == 7)
			{
				anInt169 = class30_sub2_sub2.method410();
				if(anInt169 > 32767)
					anInt169 -= 0x10000;
			} else
			if(i == 8)
			{
				anInt194 = class30_sub2_sub2.method410();
				if(anInt194 > 32767)
					anInt194 -= 0x10000;
			} else
			if(i == 10)
				class30_sub2_sub2.method410();
			else
			if(i == 11)
				aBoolean176 = true;
			else
			if(i == 12)
				anInt155 = class30_sub2_sub2.method413();
			//readDWord change if errors
			else
			if(i == 16)
				aBoolean161 = true;
			else
			if(i == 23)
			{
				anInt165 = class30_sub2_sub2.method410();
				aByte205 = class30_sub2_sub2.method409();
			} else
			if(i == 24)
				anInt188 = class30_sub2_sub2.method410();
			else
			if(i == 25)
			{
				anInt200 = class30_sub2_sub2.method410();
				aByte154 = class30_sub2_sub2.method409();
			} else
			if(i == 26)
				anInt164 = class30_sub2_sub2.method410();
			else
			if(i >= 30 && i < 35)
			{
				if(aStringArray168 == null)
					aStringArray168 = new String[5];
				aStringArray168[i - 30] = class30_sub2_sub2.method415();
				if(aStringArray168[i - 30].equalsIgnoreCase("hidden"))
					aStringArray168[i - 30] = null;
			} else
			if(i >= 35 && i < 40)
			{
				if(aStringArray189 == null)
					aStringArray189 = new String[5];
				aStringArray189[i - 35] = class30_sub2_sub2.method415();
			} else
			if(i == 40)
			{
				int j = class30_sub2_sub2.method408();
				anIntArray156 = new int[j];
				anIntArray160 = new int[j];
				for(int k = 0; k < j; k++)
				{
					anIntArray156[k] = class30_sub2_sub2.method410();
					anIntArray160[k] = class30_sub2_sub2.method410();
				}

			} else
			if(i == 78)
				anInt185 = class30_sub2_sub2.method410();
			else
			if(i == 79)
				anInt162 = class30_sub2_sub2.method410();
			else
			if(i == 90)
				anInt175 = class30_sub2_sub2.method410();
			else
			if(i == 91)
				anInt197 = class30_sub2_sub2.method410();
			else
			if(i == 92)
				anInt166 = class30_sub2_sub2.method410();
			else
			if(i == 93)
				anInt173 = class30_sub2_sub2.method410();
			else
			if(i == 95)
				anInt204 = class30_sub2_sub2.method410();
			else
			if(i == 97)
				anInt179 = class30_sub2_sub2.method410();
			else
			if(i == 98)
				anInt163 = class30_sub2_sub2.method410();
			else
			if(i >= 100 && i < 110)
			{
				if(anIntArray193 == null)
				{
					anIntArray193 = new int[10];
					anIntArray201 = new int[10];
				}
				anIntArray193[i - 100] = class30_sub2_sub2.method410();
				anIntArray201[i - 100] = class30_sub2_sub2.method410();
			} else
			if(i == 110)
				anInt167 = class30_sub2_sub2.method410();
			else
			if(i == 111)
				anInt192 = class30_sub2_sub2.method410();
			else
			if(i == 112)
				anInt191 = class30_sub2_sub2.method410();
			else
			if(i == 113)
				anInt196 = class30_sub2_sub2.method409();
			else
			if(i == 114)
				anInt184 = class30_sub2_sub2.method409() * 5;
			else
			if(i == 115)
				anInt202 = class30_sub2_sub2.method408();
			else
			if(i == 121)
				class30_sub2_sub2.method410();
			else
			if(i == 122)
				class30_sub2_sub2.method410();
		} while(true);
	}

    Class8()
    {
        anInt157 = -1;
        anInt171 = 9;
        anInt177 = 9;
        aBoolean186 = false;
        aBoolean206 = false;
    }

    private byte aByte154;
    public int anInt155;
    private int anIntArray156[];
    public int anInt157;
    static MRUNodes aClass12_158 = new MRUNodes(false, 100);
    public static MRUNodes aClass12_159 = new MRUNodes(false, 50);
    private int anIntArray160[];
    public boolean aBoolean161;
    public int anInt162;
    public int anInt163;
    private int anInt164;
    private int anInt165;
    public int anInt166;
    private int anInt167;
    public String aStringArray168[];
    private int anInt169;
    public String aString170;
    private int anInt171;
    private static Class8 aClass8Array172[];
    public int anInt173;
    private int anInt174;
    private int anInt175;
    public boolean aBoolean176;
    private int anInt177;
    public byte aByteArray178[];
    public int anInt179;
    private static int anInt180;
    public int anInt181;
    public static boolean aBoolean182 = true;
    private static Stream aClass30_Sub2_Sub2_183;
    private int anInt184;
    public int anInt185;
    private boolean aBoolean186;
    private static boolean aBoolean187;
    private int anInt188;
    public String aStringArray189[];
    public int anInt190;
    private int anInt191;
    private int anInt192;
    public int anIntArray193[];
    private int anInt194;
    private static int anIntArray195[];
    private int anInt196;
    public int anInt197;
    public int anInt198;
    public int anInt199;
    private int anInt200;
    public int anIntArray201[];
    public int anInt202;
    public static int anInt203;
    public static int frugooItems = 5;
    private int anInt204;
    private byte aByte205;
    private boolean aBoolean206;

}
