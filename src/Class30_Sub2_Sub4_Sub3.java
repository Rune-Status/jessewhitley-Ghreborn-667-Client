// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

final class Class30_Sub2_Sub4_Sub3 extends Class30_Sub2_Sub4
{

    public Class30_Sub2_Sub4_Sub3(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        aBoolean1565 = true;
        anInt1566 = 9;
        aBoolean1567 = false;
        aClass23_1568 = Class23.aClass23Array403[i1];
        anInt1560 = i;
        anInt1561 = l1;
        anInt1562 = k1;
        anInt1563 = j1;
        anInt1564 = j + l;
        if(k != 6)
        {
            throw new NullPointerException();
        } else
        {
            aBoolean1567 = false;
            return;
        }
    }

    public final Model method444(int i)
    {
        if(i != 4016)
            throw new NullPointerException();
        Model Model = aClass23_1568.method266();
        if(Model == null)
            return null;
        int j = aClass23_1568.aClass20_407.anIntArray353[anInt1569];
        Model Model_1 = new Model(9, true, Class36.method532(j, false), false, Model);
        if(!aBoolean1567)
        {
            Model_1.method469((byte)-71);
            Model_1.method470(j, 40542);
            Model_1.anIntArrayArray1658 = null;
            Model_1.anIntArrayArray1657 = null;
        }
        if(aClass23_1568.anInt410 != 128 || aClass23_1568.anInt411 != 128)
            Model_1.method478(aClass23_1568.anInt410, aClass23_1568.anInt410, anInt1566, aClass23_1568.anInt411);
        if(aClass23_1568.anInt412 != 0)
        {
            if(aClass23_1568.anInt412 == 90)
                Model_1.method473(360);
            if(aClass23_1568.anInt412 == 180)
            {
                Model_1.method473(360);
                Model_1.method473(360);
            }
            if(aClass23_1568.anInt412 == 270)
            {
                Model_1.method473(360);
                Model_1.method473(360);
                Model_1.method473(360);
            }
        }
        Model_1.method479(64 + aClass23_1568.anInt413, 850 + aClass23_1568.anInt414, -30, -50, -30, true);
        return Model_1;
    }

    public final void method454(int i, boolean flag)
    {
        if(!flag)
        {
            for(int j = 1; j > 0; j++);
        }
        for(anInt1570 += i; anInt1570 > aClass23_1568.aClass20_407.method258(anInt1569, (byte)-39);)
        {
            anInt1570 -= aClass23_1568.aClass20_407.method258(anInt1569, (byte)-39) + 1;
            anInt1569++;
            if(anInt1569 >= aClass23_1568.aClass20_407.anInt352 && (anInt1569 < 0 || anInt1569 >= aClass23_1568.aClass20_407.anInt352))
            {
                anInt1569 = 0;
                aBoolean1567 = true;
            }
        }

    }

    public int anInt1560;
    public int anInt1561;
    public int anInt1562;
    public int anInt1563;
    public int anInt1564;
    private boolean aBoolean1565;
    private int anInt1566;
    public boolean aBoolean1567;
    private Class23 aClass23_1568;
    private int anInt1569;
    private int anInt1570;
}
