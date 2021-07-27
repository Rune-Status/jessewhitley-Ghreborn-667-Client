final class Class30_Sub2_Sub4_Sub1_Sub2 extends Class30_Sub2_Sub4_Sub1
{

    public final Model method444(int i)
    {
        if(i != 4016)
            aBoolean1716 = !aBoolean1716;
        if(!aBoolean1710)
            return null;
        Model Model = method452(0);
        if(Model == null)
            return null;
        super.anInt1507 = ((Class30_Sub2_Sub4) (Model)).anInt1426;
        Model.aBoolean1659 = true;
        if(aBoolean1699)
            return Model;
        if(super.anInt1520 != -1 && super.anInt1521 != -1)
        {
            Class23 class23 = Class23.aClass23Array403[super.anInt1520];
            Model Model_2 = class23.method266();
            if(Model_2 != null)
            {
                Model Model_3 = new Model(9, true, Class36.method532(super.anInt1521, false), false, Model_2);
                Model_3.method475(0, -super.anInt1524, 16384, 0);
                Model_3.method469((byte)-71);
                Model_3.method470(class23.aClass20_407.anIntArray353[super.anInt1521], 40542);
                Model_3.anIntArrayArray1658 = null;
                Model_3.anIntArrayArray1657 = null;
                if(class23.anInt410 != 128 || class23.anInt411 != 128)
                    Model_3.method478(class23.anInt410, class23.anInt410, anInt1715, class23.anInt411);
                Model_3.method479(95 + class23.anInt413, 9282 + class23.anInt414, -30, -50, -30, true);
                Model aModel_1[] = {
                    Model, Model_3
                };
                Model = new Model(2, -819, true, aModel_1);
            }
        }
        if(aModel_1714 != null)
        {
            if(client.anInt1161 >= anInt1708)
                aModel_1714 = null;
            if(client.anInt1161 >= anInt1707 && client.anInt1161 < anInt1708)
            {
                Model Model_1 = aModel_1714;
                Model_1.method475(anInt1711 - super.anInt1550, anInt1712 - anInt1709, 16384, anInt1713 - super.anInt1551);
                if(super.anInt1510 == 512)
                {
                    Model_1.method473(360);
                    Model_1.method473(360);
                    Model_1.method473(360);
                } else
                if(super.anInt1510 == 1024)
                {
                    Model_1.method473(360);
                    Model_1.method473(360);
                } else
                if(super.anInt1510 == 1536)
                    Model_1.method473(360);
                Model aModel[] = {
                    Model, Model_1
                };
                Model = new Model(2, -819, true, aModel);
                if(super.anInt1510 == 512)
                    Model_1.method473(360);
                else
                if(super.anInt1510 == 1024)
                {
                    Model_1.method473(360);
                    Model_1.method473(360);
                } else
                if(super.anInt1510 == 1536)
                {
                    Model_1.method473(360);
                    Model_1.method473(360);
                    Model_1.method473(360);
                }
                Model_1.method475(super.anInt1550 - anInt1711, anInt1709 - anInt1712, 16384, super.anInt1551 - anInt1713);
            }
        }
        Model.aBoolean1659 = true;
        return Model;
    }

    public final void method451(int i, Stream class30_sub2_sub2)
    {
        class30_sub2_sub2.anInt1406 = 0;
        anInt1702 = class30_sub2_sub2.method408();
        anInt1706 = class30_sub2_sub2.method408();
        if(i != 0)
            return;
        aClass5_1698 = null;
        anInt1701 = 0;
        for(int j = 0; j < 12; j++)
        {
            int k = class30_sub2_sub2.method408();
            if(k == 0)
            {
                anIntArray1717[j] = 0;
                continue;
            }
            int i1 = class30_sub2_sub2.method408();
            anIntArray1717[j] = (k << 8) + i1;
            if(j == 0 && anIntArray1717[0] == 65535)
            {
                aClass5_1698 = Class5.method159(class30_sub2_sub2.method410());
                break;
            }
            if(anIntArray1717[j] >= 512 && anIntArray1717[j] - 512 < Class8.anInt203)
            {
                int l1 = Class8.method198(anIntArray1717[j] - 512).anInt202;
                if(l1 != 0)
                    anInt1701 = l1;
            }
        }

        for(int l = 0; l < 5; l++)
        {
            int j1 = class30_sub2_sub2.method408();
            if(j1 < 0 || j1 >= client.anIntArrayArray1003[l].length)
                j1 = 0;
            anIntArray1700[l] = j1;
        }

        super.anInt1511 = class30_sub2_sub2.method410();
        if(super.anInt1511 == 65535)
            super.anInt1511 = -1;
        super.anInt1512 = class30_sub2_sub2.method410();
        if(super.anInt1512 == 65535)
            super.anInt1512 = -1;
        super.anInt1554 = class30_sub2_sub2.method410();
        if(super.anInt1554 == 65535)
            super.anInt1554 = -1;
        super.anInt1555 = class30_sub2_sub2.method410();
        if(super.anInt1555 == 65535)
            super.anInt1555 = -1;
        super.anInt1556 = class30_sub2_sub2.method410();
        if(super.anInt1556 == 65535)
            super.anInt1556 = -1;
        super.anInt1557 = class30_sub2_sub2.method410();
        if(super.anInt1557 == 65535)
            super.anInt1557 = -1;
        super.anInt1505 = class30_sub2_sub2.method410();
        if(super.anInt1505 == 65535)
            super.anInt1505 = -1;
        aString1703 = Class50.method587(-45804, Class50.method584(class30_sub2_sub2.method414(-35089), (byte)-99));
        anInt1705 = class30_sub2_sub2.method408();
        anInt1723 = class30_sub2_sub2.method410();
        aBoolean1710 = true;
        aLong1718 = 0L;
        for(int k1 = 0; k1 < 12; k1++)
        {
            aLong1718 <<= 4;
            if(anIntArray1717[k1] >= 256)
                aLong1718 += anIntArray1717[k1] - 256;
        }

        if(anIntArray1717[0] >= 256)
            aLong1718 += anIntArray1717[0] - 256 >> 4;
        if(anIntArray1717[1] >= 256)
            aLong1718 += anIntArray1717[1] - 256 >> 8;
        for(int i2 = 0; i2 < 5; i2++)
        {
            aLong1718 <<= 3;
            aLong1718 += anIntArray1700[i2];
        }

        aLong1718 <<= 1;
        aLong1718 += anInt1702;
    }

    final Model method452(int i)
    {
        if(aClass5_1698 != null)
        {
            int j = -1;
            if(super.anInt1526 >= 0 && super.anInt1529 == 0)
                j = Class20.aClass20Array351[super.anInt1526].anIntArray353[super.anInt1527];
            else
            if(super.anInt1517 >= 0)
                j = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
            Model Model = aClass5_1698.method164(0, -1, j, null);
            return Model;
        }
        long l = aLong1718;
        int k = -1;
        int i1 = -1;
        int j1 = -1;
        int k1 = -1;
        if(super.anInt1526 >= 0 && super.anInt1529 == 0)
        {
            Class20 class20 = Class20.aClass20Array351[super.anInt1526];
            k = class20.anIntArray353[super.anInt1527];
            if(super.anInt1517 >= 0 && super.anInt1517 != super.anInt1511)
                i1 = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
            if(class20.anInt360 >= 0)
            {
                j1 = class20.anInt360;
                l += j1 - anIntArray1717[5] << 40;
            }
            if(class20.anInt361 >= 0)
            {
                k1 = class20.anInt361;
                l += k1 - anIntArray1717[3] << 48;
            }
        } else
        if(super.anInt1517 >= 0)
            k = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
        Model Model_1 = (Model)aClass12_1704.method222(l);
        if(i != 0)
        {
            for(int l1 = 1; l1 > 0; l1++);
        }
        if(Model_1 == null)
        {
            boolean flag = false;
            for(int i2 = 0; i2 < 12; i2++)
            {
                int k2 = anIntArray1717[i2];
                if(k1 >= 0 && i2 == 3)
                    k2 = k1;
                if(j1 >= 0 && i2 == 5)
                    k2 = j1;
                if(k2 >= 256 && k2 < 512 && !Class38.aClass38Array656[k2 - 256].method537((byte)2))
                    flag = true;
                if(k2 >= 512 && !Class8.method198(k2 - 512).method195(40903, anInt1702))
                    flag = true;
            }

            if(flag)
            {
                if(aLong1697 != -1L)
                    Model_1 = (Model)aClass12_1704.method222(aLong1697);
                if(Model_1 == null)
                    return null;
            }
        }
        if(Model_1 == null)
        {
            Model aModel[] = new Model[12];
            int j2 = 0;
            for(int l2 = 0; l2 < 12; l2++)
            {
                int i3 = anIntArray1717[l2];
                if(k1 >= 0 && l2 == 3)
                    i3 = k1;
                if(j1 >= 0 && l2 == 5)
                    i3 = j1;
                if(i3 >= 256 && i3 < 512)
                {
                    Model Model_3 = Class38.aClass38Array656[i3 - 256].method538(false);
                    if(Model_3 != null)
                        aModel[j2++] = Model_3;
                }
                if(i3 >= 512)
                {
                    Model Model_4 = Class8.method198(i3 - 512).method196(false, anInt1702);
                    if(Model_4 != null)
                        aModel[j2++] = Model_4;
                }
            }

            Model_1 = new Model(j2, aModel, -38);
            for(int j3 = 0; j3 < 5; j3++)
                if(anIntArray1700[j3] != 0)
                {
                    Model_1.method476(client.anIntArrayArray1003[j3][0], client.anIntArrayArray1003[j3][anIntArray1700[j3]]);
                    if(j3 == 1)
                        Model_1.method476(client.anIntArray1204[0], client.anIntArray1204[anIntArray1700[j3]]);
                }

            Model_1.method469((byte)-71);
		Model_1.method478(132, 132, 132, 132);
            Model_1.method479(84, 1000, -90, -580, -90, true);
            aClass12_1704.method223(Model_1, l, (byte)2);
            aLong1697 = l;
        }
        if(aBoolean1699)
            return Model_1;
        Model Model_2 = Model.aModel_1621;
        Model_2.method464(7, Model_1, Class36.method532(k, false) & Class36.method532(i1, false));
        if(k != -1 && i1 != -1)
            Model_2.method471(-20491, Class20.aClass20Array351[super.anInt1526].anIntArray357, i1, k);
        else
        if(k != -1)
            Model_2.method470(k, 40542);
        Model_2.method466(false);
        Model_2.anIntArrayArray1658 = null;
        Model_2.anIntArrayArray1657 = null;
        return Model_2;
    }

    public final boolean method449(boolean flag)
    {
        if(!flag)
            throw new NullPointerException();
        return aBoolean1710;
    }

    public final Model method453(byte byte0)
    {
        if(byte0 != -41)
            anInt1715 = 132;
        if(!aBoolean1710)
            return null;
        if(aClass5_1698 != null)
            return aClass5_1698.method160(true);
        boolean flag = false;
        for(int i = 0; i < 12; i++)
        {
            int j = anIntArray1717[i];
            if(j >= 256 && j < 512 && !Class38.aClass38Array656[j - 256].method539(false))
                flag = true;
            if(j >= 512 && !Class8.method198(j - 512).method192(-2836, anInt1702))
                flag = true;
        }

        if(flag)
            return null;
        Model aModel[] = new Model[12];
        int k = 0;
        for(int l = 0; l < 12; l++)
        {
            int i1 = anIntArray1717[l];
            if(i1 >= 256 && i1 < 512)
            {
                Model Model_1 = Class38.aClass38Array656[i1 - 256].method540(0);
                if(Model_1 != null)
                    aModel[k++] = Model_1;
            }
            if(i1 >= 512)
            {
                Model Model_2 = Class8.method198(i1 - 512).method194(-705, anInt1702);
                if(Model_2 != null)
                    aModel[k++] = Model_2;
            }
        }

        Model Model = new Model(k, aModel, -38);
        for(int j1 = 0; j1 < 5; j1++)
            if(anIntArray1700[j1] != 0)
            {
                Model.method476(client.anIntArrayArray1003[j1][0], client.anIntArrayArray1003[j1][anIntArray1700[j1]]);
                if(j1 == 1)
                    Model.method476(client.anIntArray1204[0], client.anIntArray1204[anIntArray1700[j1]]);
            }

        return Model;
    }

    Class30_Sub2_Sub4_Sub1_Sub2()
    {
        aLong1697 = -1L;
        aBoolean1699 = false;
        anIntArray1700 = new int[5];
        aBoolean1710 = false;
        anInt1715 = 9;
        aBoolean1716 = true;
        anIntArray1717 = new int[12];
    }

    long aLong1697;
    Class5 aClass5_1698;
    boolean aBoolean1699;
    int anIntArray1700[];
    int anInt1701;
    int anInt1702;
    String aString1703;
    static MRUNodes aClass12_1704 = new MRUNodes(false, 260);
    int anInt1705;
    int anInt1706;
    int anInt1707;
    int anInt1708;
    int anInt1709;
    boolean aBoolean1710;
    int anInt1711;
    int anInt1712;
    int anInt1713;
    Model aModel_1714;
    private int anInt1715;
    private boolean aBoolean1716;
    int anIntArray1717[];
    long aLong1718;
    int anInt1719;
    int anInt1720;
    int anInt1721;
    int anInt1722;
    int anInt1723;

}
