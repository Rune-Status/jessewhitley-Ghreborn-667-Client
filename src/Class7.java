final class Class7 {

	private static int anInt123 = (int)(Math.random() * 17D) - 8;
	private int anIntArray124[];
	private int anIntArray125[];
	private int anIntArray126[];
	private int anIntArray127[];
	private int anIntArray128[];
	private int tileHeights[][][];
	private byte aByteArrayArrayArray130[][][];
	static int anInt131;
	private boolean aBoolean132;
	private static int anInt133 = (int)(Math.random() * 33D) - 16;
	private byte aByteArrayArrayArray134[][][];
	private int anIntArrayArrayArray135[][][];
	private byte aByteArrayArrayArray136[][][];
	private static final int anIntArray137[] = {
		1, 0, -1, 0
	};
	private static int anInt138 = 323;
	private int anIntArrayArray139[][];
	private static final int anIntArray140[] = {
		16, 32, 64, 128
	};
	private static boolean aBoolean141;
	private byte aByteArrayArrayArray142[][][];
	private boolean aBoolean143;
	private static final int anIntArray144[] = {
		0, -1, 0, 1
	};
	static int anInt145 = 99;
	private int anInt146;
	private int anInt147;
	private byte aByteArrayArrayArray148[][][];
	private byte aByteArrayArrayArray149[][][];
	private int anInt150;
	static boolean aBoolean151 = true;
	private static final int anIntArray152[] = {
		1, 2, 4, 8
	};
	private static int anInt153 = -388;

	public Class7(byte abyte0[][][], int i, int j, int k, int ai[][][]) {
		aBoolean132 = true;
		aBoolean143 = false;
		anInt150 = -53;
		anInt145 = 99;
		anInt146 = k;
		anInt147 = j;
		while(i >= 0) {
			anInt153 = -320;
		}
		tileHeights = ai;
		aByteArrayArrayArray149 = abyte0;
		aByteArrayArrayArray142 = new byte[4][anInt146][anInt147];
		aByteArrayArrayArray130 = new byte[4][anInt146][anInt147];
		aByteArrayArrayArray136 = new byte[4][anInt146][anInt147];
		aByteArrayArrayArray148 = new byte[4][anInt146][anInt147];
		anIntArrayArrayArray135 = new int[4][anInt146 + 1][anInt147 + 1];
		aByteArrayArrayArray134 = new byte[4][anInt146 + 1][anInt147 + 1];
		anIntArrayArray139 = new int[anInt146 + 1][anInt147 + 1];
		anIntArray124 = new int[anInt147];
		anIntArray125 = new int[anInt147];
		anIntArray126 = new int[anInt147];
		anIntArray127 = new int[anInt147];
		anIntArray128 = new int[anInt147];
	}

	private static final int method170(int i, int j) {
		int k = i + j * 57;
		k = k << 13 ^ k;
		int l = k * (k * k * 15731 + 0xc0ae5) + 0x5208dd0d & 0x7fffffff;
		return l >> 19 & 0xff;
	}

	public final void method171(Class11 aclass11[], Class25 class25, int i) {
		for(int j = 0; j < 4; j++) {
			for(int k = 0; k < 104; k++) {
				for(int i1 = 0; i1 < 104; i1++) {
					if((aByteArrayArrayArray149[j][k][i1] & 1) == 1) {
						int k1 = j;
						if((aByteArrayArrayArray149[1][k][i1] & 2) == 2) {
							k1--;
						}
						if(k1 >= 0) {
							aclass11[k1].method213(i1, 0, k);
						}
					}
				}

			}

		}

		if(i < 2 || i > 2) {
			anInt138 = 329;
		}
		anInt123 += (int)(Math.random() * 5D) - 2;
		if(anInt123 < -8) {
			anInt123 = -8;
		}
		if(anInt123 > 8) {
			anInt123 = 8;
		}
		anInt133 += (int)(Math.random() * 5D) - 2;
		if(anInt133 < -16) {
			anInt133 = -16;
		}
		if(anInt133 > 16) {
			anInt133 = 16;
		}
		for(int l = 0; l < 4; l++) {
			byte abyte0[][] = aByteArrayArrayArray134[l];
			byte byte0 = 96;
			char c = '\u0300';
			byte byte1 = -50;
			byte byte2 = -10;
			byte byte3 = -50;
			int j3 = (int)Math.sqrt(byte1 * byte1 + byte2 * byte2 + byte3 * byte3);
			int l3 = c * j3 >> 8;
			for(int j4 = 1; j4 < anInt147 - 1; j4++) {
				for(int j5 = 1; j5 < anInt146 - 1; j5++) {
					int k6 = tileHeights[l][j5 + 1][j4] - tileHeights[l][j5 - 1][j4];
					int l7 = tileHeights[l][j5][j4 + 1] - tileHeights[l][j5][j4 - 1];
					int j9 = (int)Math.sqrt(k6 * k6 + 0x10000 + l7 * l7);
					int k12 = (k6 << 8) / j9;
					int l13 = 0x10000 / j9;
					int j15 = (l7 << 8) / j9;
					int j16 = byte0 + (byte1 * k12 + byte2 * l13 + byte3 * j15) / l3;
					int j17 = (abyte0[j5 - 1][j4] >> 2) + (abyte0[j5 + 1][j4] >> 3) + (abyte0[j5][j4 - 1] >> 2) + (abyte0[j5][j4 + 1] >> 3) + (abyte0[j5][j4] >> 1);
					anIntArrayArray139[j5][j4] = j16 - j17;
				}

			}

			for(int k5 = 0; k5 < anInt147; k5++) {
				anIntArray124[k5] = 0;
				anIntArray125[k5] = 0;
				anIntArray126[k5] = 0;
				anIntArray127[k5] = 0;
				anIntArray128[k5] = 0;
			}

			for(int l6 = -5; l6 < anInt146 + 5; l6++) {
				for(int i8 = 0; i8 < anInt147; i8++) {
					int k9 = l6 + 5;
					if(k9 >= 0 && k9 < anInt146) {
						int l12 = aByteArrayArrayArray142[l][k9][i8] & 0xff;
						if(l12 > 0) {
							Class22 class22 = Class22.aClass22Array388[l12 - 1];
							anIntArray124[i8] += class22.anInt397;
							anIntArray125[i8] += class22.anInt395;
							anIntArray126[i8] += class22.anInt396;
							anIntArray127[i8] += class22.anInt398;
							anIntArray128[i8]++;
						}
					}
					int i13 = l6 - 5;
					if(i13 >= 0 && i13 < anInt146) {
						int i14 = aByteArrayArrayArray142[l][i13][i8] & 0xff;
						if(i14 > 0) {
							Class22 class22_1 = Class22.aClass22Array388[i14 - 1];
							anIntArray124[i8] -= class22_1.anInt397;
							anIntArray125[i8] -= class22_1.anInt395;
							anIntArray126[i8] -= class22_1.anInt396;
							anIntArray127[i8] -= class22_1.anInt398;
							anIntArray128[i8]--;
						}
					}
				}

				if(l6 >= 1 && l6 < anInt146 - 1) {
					int l9 = 0;
					int j13 = 0;
					int j14 = 0;
					int k15 = 0;
					int k16 = 0;
					for(int k17 = -5; k17 < anInt147 + 5; k17++) {
						int j18 = k17 + 5;
						if(j18 >= 0 && j18 < anInt147) {
							l9 += anIntArray124[j18];
							j13 += anIntArray125[j18];
							j14 += anIntArray126[j18];
							k15 += anIntArray127[j18];
							k16 += anIntArray128[j18];
						}
						int k18 = k17 - 5;
						if(k18 >= 0 && k18 < anInt147) {
							l9 -= anIntArray124[k18];
							j13 -= anIntArray125[k18];
							j14 -= anIntArray126[k18];
							k15 -= anIntArray127[k18];
							k16 -= anIntArray128[k18];
						}
						if(k17 >= 1 && k17 < anInt147 - 1 && (!aBoolean151 || (aByteArrayArrayArray149[0][l6][k17] & 2) != 0 || (aByteArrayArrayArray149[l][l6][k17] & 0x10) == 0 && method182(k17, l, l6, 0) == anInt131)) {
							if(l < anInt145) {
								anInt145 = l;
							}
							int l18 = aByteArrayArrayArray142[l][l6][k17] & 0xff;
							int i19 = aByteArrayArrayArray130[l][l6][k17] & 0xff;
							if(l18 > 0 || i19 > 0) {
								int j19 = tileHeights[l][l6][k17];
								int k19 = tileHeights[l][l6 + 1][k17];
								int l19 = tileHeights[l][l6 + 1][k17 + 1];
								int i20 = tileHeights[l][l6][k17 + 1];
								int j20 = anIntArrayArray139[l6][k17];
								int k20 = anIntArrayArray139[l6 + 1][k17];
								int l20 = anIntArrayArray139[l6 + 1][k17 + 1];
								int i21 = anIntArrayArray139[l6][k17 + 1];
								int j21 = -1;
								int k21 = -1;
								if(l18 > 0) {
									int l21 = (l9 * 256) / k15;
									int j22 = j13 / k16;
									int l22 = j14 / k16;
									j21 = method177(l21, j22, l22);
									l21 = l21 + anInt123 & 0xff;
									l22 += anInt133;
									if(l22 < 0) {
										l22 = 0;
									} else
										if(l22 > 255) {
										l22 = 255;
										}
									k21 = method177(l21, j22, l22);
								}
								if(l > 0) {
									boolean flag = true;
									if(l18 == 0 && aByteArrayArrayArray136[l][l6][k17] != 0) {
										flag = false;
									}
									if(i19 > 0 && !OverLayFlo317.overLayFlo317s[i19 - 1].aBoolean393) {
										flag = false;
									}
									if(flag && j19 == k19 && j19 == l19 && j19 == i20) {
										anIntArrayArrayArray135[l][l6][k17] |= 0x924;
									}
								}
								int i22 = 0;
								if(j21 != -1) {
									i22 = Class30_Sub2_Sub1_Sub3.anIntArray1482[method187(k21, 96)];
								}
								if(i19 == 0) {
									class25.method279(l, l6, k17, 0, 0, -1, j19, k19, l19, i20, method187(j21, j20), method187(j21, k20), method187(j21, l20), method187(j21, i21), 0, 0, 0, 0, i22, 0);
								} else {
									int k22 = aByteArrayArrayArray136[l][l6][k17] + 1;
									byte byte4 = aByteArrayArrayArray148[l][l6][k17];
									//Class22 class22_2 = Class22.aClass22Array388[i19 - 1];
									OverLayFlo317 class22_2 = OverLayFlo317.overLayFlo317s[i19 - 1];
									int i23 = class22_2.textureId;
									int j23;
									int k23;
																	if (i23 > 50) {
									i23 = -1;
								}
									if(i23 >= 0) {
										k23 = Class30_Sub2_Sub1_Sub3.method369(i23, 12660);
										j23 = -1;
										} else if (class22_2.rgb == 0xff00ff) {//pink
											k23 = 0;
											j23 = -2;
											i23 = -1;
										} else if(class22_2.rgb == 0x333333) {//green
											k23 = Class30_Sub2_Sub1_Sub3.anIntArray1482[method185(class22_2.anInt399, 96)];                                
											j23 = -2;
											i23 = -1;

									} else
										if(class22_2.textureId == 0xff00ff) {
										k23 = 0;
										j23 = -2;
										i23 = -1;
										} else {
										j23 = method177(class22_2.anInt394, class22_2.anInt395, class22_2.anInt396);
										k23 = Class30_Sub2_Sub1_Sub3.anIntArray1482[method185(class22_2.anInt399, 96)];
										}
	if ((i19-1) == 54) {
                    k23  = 0x8B8B83;
                    j23 = -2;
                    i23 = -1;
                }
										if((i19-1) == 111){
											k23 = Class30_Sub2_Sub1_Sub3.method369(1, 12660);
											j23 = -1;
                                    							i23 = 1;
											}
									class25.method279(l, l6, k17, k22, byte4, i23, j19, k19, l19, i20, method187(j21, j20), method187(j21, k20), method187(j21, l20), method187(j21, i21), method185(j23, j20), method185(j23, k20), method185(j23, l20), method185(j23, i21), i22, k23);
								}
							}
						}
					}

				}
			}

			for(int j8 = 1; j8 < anInt147 - 1; j8++) {
				for(int i10 = 1; i10 < anInt146 - 1; i10++) {
					class25.method278(l, i10, j8, method182(j8, l, i10, 0));
				}

			}

		}

		class25.method305(-10, -50, -50);
		for(int j1 = 0; j1 < anInt146; j1++) {
			for(int l1 = 0; l1 < anInt147; l1++) {
				if((aByteArrayArrayArray149[1][j1][l1] & 2) == 2) {
					class25.method276(l1, j1, -438);
				}
			}

		}

		int i2 = 1;
		int j2 = 2;
		int k2 = 4;
		for(int l2 = 0; l2 < 4; l2++) {
			if(l2 > 0) {
				i2 <<= 3;
				j2 <<= 3;
				k2 <<= 3;
			}
			for(int i3 = 0; i3 <= l2; i3++) {
				for(int k3 = 0; k3 <= anInt147; k3++) {
					for(int i4 = 0; i4 <= anInt146; i4++) {
						if((anIntArrayArrayArray135[i3][i4][k3] & i2) != 0) {
							int k4 = k3;
							int l5 = k3;
							int i7 = i3;
							int k8 = i3;
							for(; k4 > 0 && (anIntArrayArrayArray135[i3][i4][k4 - 1] & i2) != 0; k4--) { }
							for(; l5 < anInt147 && (anIntArrayArrayArray135[i3][i4][l5 + 1] & i2) != 0; l5++) { }
							label0:
								for(; i7 > 0; i7--) {
									for(int j10 = k4; j10 <= l5; j10++) {
										if((anIntArrayArrayArray135[i7 - 1][i4][j10] & i2) == 0) {
											break label0;
										}
									}

								}

								label1:
									for(; k8 < l2; k8++) {
										for(int k10 = k4; k10 <= l5; k10++) {
											if((anIntArrayArrayArray135[k8 + 1][i4][k10] & i2) == 0) {
												break label1;
											}
										}

									}

									int l10 = ((k8 + 1) - i7) * ((l5 - k4) + 1);
									if(l10 >= 8) {
										char c1 = '\360';
										int k14 = tileHeights[k8][i4][k4] - c1;
										int l15 = tileHeights[i7][i4][k4];
										Class25.method277(l2, i4 * 128, l15, i4 * 128, l5 * 128 + 128, k14, anInt150, k4 * 128, 1);
										for(int l16 = i7; l16 <= k8; l16++) {
											for(int l17 = k4; l17 <= l5; l17++) {
												anIntArrayArrayArray135[l16][i4][l17] &= ~i2;
											}

										}

									}
						}
						if((anIntArrayArrayArray135[i3][i4][k3] & j2) != 0) {
							int l4 = i4;
							int i6 = i4;
							int j7 = i3;
							int l8 = i3;
							for(; l4 > 0 && (anIntArrayArrayArray135[i3][l4 - 1][k3] & j2) != 0; l4--) { }
							for(; i6 < anInt146 && (anIntArrayArrayArray135[i3][i6 + 1][k3] & j2) != 0; i6++) { }
							label2:
								for(; j7 > 0; j7--) {
									for(int i11 = l4; i11 <= i6; i11++) {
										if((anIntArrayArrayArray135[j7 - 1][i11][k3] & j2) == 0) {
											break label2;
										}
									}

								}

								label3:
									for(; l8 < l2; l8++) {
										for(int j11 = l4; j11 <= i6; j11++) {
											if((anIntArrayArrayArray135[l8 + 1][j11][k3] & j2) == 0) {
												break label3;
											}
										}

									}

									int k11 = ((l8 + 1) - j7) * ((i6 - l4) + 1);
									if(k11 >= 8) {
										char c2 = '\360';
										int l14 = tileHeights[l8][l4][k3] - c2;
										int i16 = tileHeights[j7][l4][k3];
										Class25.method277(l2, l4 * 128, i16, i6 * 128 + 128, k3 * 128, l14, anInt150, k3 * 128, 2);
										for(int i17 = j7; i17 <= l8; i17++) {
											for(int i18 = l4; i18 <= i6; i18++) {
												anIntArrayArrayArray135[i17][i18][k3] &= ~j2;
											}

										}

									}
						}
						if((anIntArrayArrayArray135[i3][i4][k3] & k2) != 0) {
							int i5 = i4;
							int j6 = i4;
							int k7 = k3;
							int i9 = k3;
							for(; k7 > 0 && (anIntArrayArrayArray135[i3][i4][k7 - 1] & k2) != 0; k7--) { }
							for(; i9 < anInt147 && (anIntArrayArrayArray135[i3][i4][i9 + 1] & k2) != 0; i9++) { }
							label4:
								for(; i5 > 0; i5--) {
									for(int l11 = k7; l11 <= i9; l11++) {
										if((anIntArrayArrayArray135[i3][i5 - 1][l11] & k2) == 0) {
											break label4;
										}
									}

								}

								label5:
									for(; j6 < anInt146; j6++) {
										for(int i12 = k7; i12 <= i9; i12++) {
											if((anIntArrayArrayArray135[i3][j6 + 1][i12] & k2) == 0) {
												break label5;
											}
										}

									}

									if(((j6 - i5) + 1) * ((i9 - k7) + 1) >= 4) {
										int j12 = tileHeights[i3][i5][k7];
										Class25.method277(l2, i5 * 128, j12, j6 * 128 + 128, i9 * 128 + 128, j12, anInt150, k7 * 128, 4);
										for(int k13 = i5; k13 <= j6; k13++) {
											for(int i15 = k7; i15 <= i9; i15++) {
												anIntArrayArrayArray135[i3][k13][i15] &= ~k2;
											}

										}

									}
						}
					}

				}

			}

		}

	}

	private static final int method172(int i, int j) {
		int k = (method176(i + 45365, j + 0x16713, 4) - 128) + (method176(i + 10294, j + 37821, 2) - 128 >> 1) + (method176(i, j, 1) - 128 >> 2);
		k = (int)((double)k * 0.29999999999999999D) + 35;
		if(k < 10) {
			k = 10;
		} else
			if(k > 60) {
			k = 60;
			}
		return k;
	}

	public static final void method173(byte byte0, Stream class30_sub2_sub2, Class42_Sub1 class42_sub1) {
		label0:
		{
			int i = -1;
			if(byte0 != -107) {
				aBoolean141 = !aBoolean141;
			}
			do
			{
				int j = class30_sub2_sub2.method422();
				if(j == 0) {
					break label0;
				}
				i += j;
				ObjectDefinition class46 = ObjectDefinition.forID(i);
				class46.method574(class42_sub1, -235);
				do
				{
					int k = class30_sub2_sub2.method422();
					if(k == 0) {
						break;
					}
					class30_sub2_sub2.method408();
				} while(true);
			} while(true);
		}
	}

	public final void method174(int i, int j, int k, int l, int i1) {
		for(int j1 = i; j1 <= i + j; j1++) {
			for(int k1 = i1; k1 <= i1 + l; k1++) {
				if(k1 >= 0 && k1 < anInt146 && j1 >= 0 && j1 < anInt147) {
					aByteArrayArrayArray134[0][k1][j1] = 127;
					if(k1 == i1 && k1 > 0) {
						tileHeights[0][k1][j1] = tileHeights[0][k1 - 1][j1];
					}
					if(k1 == i1 + l && k1 < anInt146 - 1) {
						tileHeights[0][k1][j1] = tileHeights[0][k1 + 1][j1];
					}
					if(j1 == i && j1 > 0) {
						tileHeights[0][k1][j1] = tileHeights[0][k1][j1 - 1];
					}
					if(j1 == i + j && j1 < anInt147 - 1) {
						tileHeights[0][k1][j1] = tileHeights[0][k1][j1 + 1];
					}
				}
			}

		}

		if(k != 0) {
			anInt153 = 284;
		}
	}
	
	private boolean offsetFix(int id)
	{
	if(id == 38739) return true;
	if(id == 38789) return true;
	if(id == 38791) return true;
	if(id == 38795) return true;
	if(id == 39097) return true;
	if(id == 40295) return true;
	if(id == 40320) return true;
	if(id == 40349) return true;
	return false;
	}

	public final void method175(int regionY, Class25 class25, Class11 class11, int type, int plane, int regionX, int objId,boolean flag, int j1) {
		if(aBoolean151 && (aByteArrayArrayArray149[0][regionX][regionY] & 2) == 0) {
			if((aByteArrayArrayArray149[plane][regionX][regionY] & 0x10) != 0) {
				return;
			}
			if(method182(regionY, plane, regionX, 0) != anInt131) {
				return;
			}
		}
		if(plane < anInt145) {
			anInt145 = plane;
		}
		ObjectDefinition class46 = ObjectDefinition.forID(objId);
		int size1;
		int size2;
		if (j1 == 1 || j1 == 3) {
			size1 = class46.anInt761;//objectSizeY
			size2 = class46.anInt744;//objectSizeX
		} else {
			size1 = class46.anInt744;
			size2 = class46.anInt761;
		}
		int modX;
		int modX1;
		if (104 >= (size1 + regionX)) {
			modX1 = regionX + (size1 + 1 >> 1);
			modX = regionX + (size1 >> 1);
		} else {
			modX = regionX;
			modX1 = regionX + 1;
		}
		int modY;
		int modY1;
		if (104>= (size2 + regionY)) {
			modY1 = regionY + (size2 + 1 >> 1);
			modY = (size2 >> 1) + regionY;
		} else {
			modY = regionY;
			modY1 = 1 + regionY;
		}
		int a_y = tileHeights[plane][modX][modY];
		int b_y = tileHeights[plane][modX1][modY];
		int d_y = tileHeights[plane][modX1][modY1];
		int c_y = tileHeights[plane][modX][modY1];
		int k2 = a_y + b_y + d_y + c_y >> 2;
		int l2 = regionX + (regionY << 7) + ((objId > 0x7fff ? objId & 0x7fff : objId) << 14) + 0x40000000;
		if(!class46.hasActions) {
			l2 += 0x80000000;
		}
		byte byte0 = (byte)((j1 << 6) + type);
		if(type == 22) {
			if(aBoolean151 && !class46.hasActions && !class46.aBoolean736) {
				return;
			}
			Object obj;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj = class46.method578(22, j1, k2, a_y, b_y, d_y, -1);
			} else {
				obj = new Class30_Sub2_Sub4_Sub5(objId, j1, 22, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method280(plane, c_y, regionY, 68, ((Class30_Sub2_Sub4) (obj)), byte0, l2, regionX, l2);
			if(class46.aBoolean767 && class46.hasActions && class11 != null) {
				class11.method213(regionY, 0, regionX);
			}
			return;
		}
		if(type == 10 || type == 11) {
			Object obj1;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj1 = class46.method578(10, j1, k2, a_y, b_y, d_y, -1);
			} else {
				obj1 = new Class30_Sub2_Sub4_Sub5(objId, j1, 10, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			if(obj1 != null) {
				int i5 = 0;
				if(type == 11) {
					i5 += 256;
				}
				int j4;
				int l4;
				if(j1 == 1 || j1 == 3) {
					j4 = class46.anInt761;
					l4 = class46.anInt744;
				} else {
					j4 = class46.anInt744;
					l4 = class46.anInt761;
				}
				if(class25.method284(l2, byte0, c_y, l4, ((Class30_Sub2_Sub4) (obj1)), j4, plane, i5, (byte)110, regionY, regionX, l4) && class46.aBoolean779) {
					Model Model;
					if(obj1 instanceof Model) {
						Model = (Model)obj1;
					} else {
						Model = class46.method578(10, j1, k2, a_y, b_y, d_y, -1);
					}
					if(Model != null) {
						for(int j5 = 0; j5 <= j4; j5++) {
							for(int k5 = 0; k5 <= l4; k5++) {
								int l5 = Model.anInt1650 / 4;
								if(l5 > 30) {
									l5 = 30;
								}
								if(l5 > aByteArrayArrayArray134[plane][regionX + j5][regionY + k5]) {
									aByteArrayArrayArray134[plane][regionX + j5][regionY + k5] = (byte)l5;
								}
							}

						}

					}
				}
			}
			if(class46.aBoolean767 && class11 != null) {
				class11.method212(class46.aBoolean757, anInt138, class46.anInt744, class46.anInt761, regionY, regionX, j1);
			}
			return;
		}
		if(type >= 12) {
			Object obj2;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj2 = class46.method578(type, j1, k2, a_y, b_y, d_y, -1);
			} else {
				obj2 = new Class30_Sub2_Sub4_Sub5(objId, j1, type, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method284(l2, byte0, c_y, 1, ((Class30_Sub2_Sub4) (obj2)), 1, plane, 0, (byte)110, regionX, regionY, l2);
			if(type >= 12 && type <= 17 && type != 13 && plane > 0) {
				anIntArrayArrayArray135[plane][regionX][regionY] |= 0x924;
			}
			if(class46.aBoolean767 && class11 != null) {
				class11.method212(class46.aBoolean757, anInt138, class46.anInt744, class46.anInt761, regionX, regionY, j1);
			}
			return;
		}
		if(type == 0) {
			Object obj3;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj3 = class46.method578(0, j1, k2, a_y, b_y, d_y, -1);
			} else {
				obj3 = new Class30_Sub2_Sub4_Sub5(objId, j1, 0, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method282(anIntArray152[j1], ((Class30_Sub2_Sub4) (obj3)), true, l2, regionY, byte0, regionX, null, c_y, 0, plane, l2);
			if(j1 == 0) {
				if(class46.aBoolean779) {
					aByteArrayArrayArray134[plane][regionX][regionY] = 50;
					aByteArrayArrayArray134[plane][regionX][regionY + 1] = 50;
				}
				if(class46.aBoolean764) {
					anIntArrayArrayArray135[plane][regionX][regionY] |= 0x249;
				}
			} else
				if(j1 == 1) {
				if(class46.aBoolean779) {
					aByteArrayArrayArray134[plane][regionX][regionY + 1] = 50;
					aByteArrayArrayArray134[plane][regionX + 1][regionY + 1] = 50;
				}
				if(class46.aBoolean764) {
					anIntArrayArrayArray135[plane][regionX][regionY + 1] |= 0x492;
				}
				} else
					if(j1 == 2) {
				if(class46.aBoolean779) {
					aByteArrayArrayArray134[plane][regionX + 1][regionY] = 50;
					aByteArrayArrayArray134[plane][regionX + 1][regionY + 1] = 50;
				}
				if(class46.aBoolean764) {
					anIntArrayArrayArray135[plane][regionX + 1][regionY] |= 0x249;
				}
					} else
						if(j1 == 3) {
				if(class46.aBoolean779) {
					aByteArrayArrayArray134[plane][regionX][regionY] = 50;
					aByteArrayArrayArray134[plane][regionX + 1][regionY] = 50;
				}
				if(class46.aBoolean764) {
					anIntArrayArrayArray135[plane][regionX][regionY] |= 0x492;
				}
						}
			if(class46.aBoolean767 && class11 != null) {
				class11.method211(regionY, j1, regionX, type, (byte)1, class46.aBoolean757);
			}
			if(class46.anInt775 != 16) {
				class25.method290(regionY, 441, class46.anInt775, regionX, plane);
			}
			return;
		}
		if(type == 1) {
			Object obj4;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj4 = class46.method578(1, j1, k2, a_y, b_y, d_y, -1);
			} else {
				obj4 = new Class30_Sub2_Sub4_Sub5(objId, j1, 1, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method282(anIntArray140[j1], ((Class30_Sub2_Sub4) (obj4)), true, l2, regionY, byte0, regionX, null, c_y, 0, plane, l2);
			if(class46.aBoolean779) {
				if(j1 == 0) {
					aByteArrayArrayArray134[plane][regionX][regionY + 1] = 50;
				} else
					if(j1 == 1) {
					aByteArrayArrayArray134[plane][regionX + 1][regionY + 1] = 50;
					} else
						if(j1 == 2) {
					aByteArrayArrayArray134[plane][regionX + 1][regionY] = 50;
						} else
							if(j1 == 3) {
					aByteArrayArrayArray134[plane][regionX][regionY] = 50;
							}
			}
			if(class46.aBoolean767 && class11 != null) {
				class11.method211(regionY, j1, regionX, type, (byte)1, class46.aBoolean757);
			}
			return;
		}
		if(type == 2) {
			int i3 = j1 + 1 & 3;
			Object obj11;
			Object obj12;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj11 = class46.method578(2, 4 + j1, k2, a_y, b_y, d_y, -1);
				obj12 = class46.method578(2, i3, k2, a_y, b_y, d_y, -1);
			} else {
				obj11 = new Class30_Sub2_Sub4_Sub5(objId, 4 + j1, 2, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
				obj12 = new Class30_Sub2_Sub4_Sub5(objId, i3, 2, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method282(anIntArray152[j1], ((Class30_Sub2_Sub4) (obj11)), true, l2, regionY, byte0, regionX, ((Class30_Sub2_Sub4) (obj12)), c_y, anIntArray152[i3], plane, i3);
			if(class46.aBoolean764) {
				if(j1 == 0) {
					anIntArrayArrayArray135[plane][regionX][regionY] |= 0x249;
					anIntArrayArrayArray135[plane][regionX][regionY + 1] |= 0x492;
				} else
					if(j1 == 1) {
					anIntArrayArrayArray135[plane][regionX][regionY + 1] |= 0x492;
					anIntArrayArrayArray135[plane][regionX + 1][regionY] |= 0x249;
					} else
						if(j1 == 2) {
					anIntArrayArrayArray135[regionX][regionX + 1][regionY] |= 0x249;
					anIntArrayArrayArray135[plane][regionX][regionY] |= 0x492;
						} else
							if(j1 == 3) {
					anIntArrayArrayArray135[plane][regionX][regionY] |= 0x492;
					anIntArrayArrayArray135[plane][regionX][regionY] |= 0x249;
							}
			}
			if(class46.aBoolean767 && class11 != null) {
				class11.method211(regionY, j1, regionX, type, (byte)1, class46.aBoolean757);
			}
			if(class46.anInt775 != 16) {
				class25.method290(regionY, 441, class46.anInt775, regionX, plane);
			}
			return;
		}
		if(type == 3) {
			Object obj5;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj5 = class46.method578(3, j1, k2, a_y, b_y, d_y, -1);
			} else {
				obj5 = new Class30_Sub2_Sub4_Sub5(objId, j1, 3, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method282(anIntArray140[j1], ((Class30_Sub2_Sub4) (obj5)), true, l2, regionY, byte0,regionX, null, c_y, 0, plane, l2);
			if(class46.aBoolean779) {
				if(j1 == 0) {
					aByteArrayArrayArray134[plane][regionX][regionY + 1] = 50;
				} else
					if(j1 == 1) {
					aByteArrayArrayArray134[plane][regionX + 1][regionY + 1] = 50;
					} else
						if(j1 == 2) {
					aByteArrayArrayArray134[plane][regionX + 1][regionY] = 50;
						} else
							if(j1 == 3) {
					aByteArrayArrayArray134[plane][regionX][regionY] = 50;
							}
			}
			if(class46.aBoolean767 && class11 != null) {
				class11.method211(regionY, j1, regionX, type, (byte)1, class46.aBoolean757);
			}
			return;
		}
		if(type == 9) {
			Object obj6;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj6 = class46.method578(type, j1, k2, a_y, b_y, d_y, -1);
			} else {
				obj6 = new Class30_Sub2_Sub4_Sub5(objId, j1, type, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method284(l2, byte0, c_y, 1, ((Class30_Sub2_Sub4) (obj6)), 1, plane, 0, (byte)110, regionY, regionX, l2);
			if(class46.aBoolean767 && class11 != null) {
				class11.method212(class46.aBoolean757, anInt138, class46.anInt744, class46.anInt761, regionX, regionY, j1);
			}
			return;
		}
		if(class46.aBoolean762) {
			if(j1 == 1) {
				int j3 = d_y;
				d_y = b_y;
				b_y = a_y;
				a_y = k2;
				k2 = j3;
			} else
				if(j1 == 2) {
				int k3 = d_y;
				d_y = a_y;
				a_y = k3;
				k3 = b_y;
				b_y = k2;
				k2 = k3;
				} else
					if(j1 == 3) {
				int l3 = d_y;
				d_y = k2;
				k2 = a_y;
				a_y = b_y;
				b_y = l3;
					}
		}
		if(type == 4) {
			Object obj7;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj7 = class46.method578(4, 0, k2, a_y, b_y, d_y, -1);
			} else {
				obj7 = new Class30_Sub2_Sub4_Sub5(objId, 0, 4, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method283(l2, regionY, j1 * 512, -460, plane, 0, c_y, ((Class30_Sub2_Sub4) (obj7)), regionX, byte0, 0, anIntArray152[j1], l2);
			return;
		}
		if(type == 5) {
			int i4 = 16;
			int k4 = class25.method300(plane, regionX, regionY);
			if(k4 > 0) {
				i4 = ObjectDefinition.forID(k4 >> 14 & 0x7fff).anInt775;
			}
			Object obj13;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj13 = class46.method578(4, 0, k2, a_y, b_y, d_y, -1);
			} else {
				obj13 = new Class30_Sub2_Sub4_Sub5(objId, 0, 4, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method283(l2, regionY, j1 * 512, -460, plane, anIntArray137[j1] * i4, c_y, ((Class30_Sub2_Sub4) (obj13)), regionX, byte0, anIntArray144[j1] * i4, anIntArray152[j1], k4);
			return;
		}
		if(type == 6) {
			Object obj8;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj8 = class46.method578(4, 0, k2, a_y, b_y, d_y, -1);
			} else {
				obj8 = new Class30_Sub2_Sub4_Sub5(objId, 0, 4, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method283(l2,regionX, j1, -460, plane, 0, c_y, ((Class30_Sub2_Sub4) (obj8)), regionY, byte0, 0, 256, l2);
			return;
		}
		if(type == 7) {
			Object obj9;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj9 = class46.method578(4, 0, k2, a_y, b_y, d_y, -1);
			} else {
				obj9 = new Class30_Sub2_Sub4_Sub5(objId, 0, 4, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method283(l2, regionY, j1, -460, plane, 0, c_y, ((Class30_Sub2_Sub4) (obj9)), plane, byte0, 0, 512, l2);
			return;
		}
		if(type == 8) {
			Object obj10;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj10 = class46.method578(4, 0, k2, a_y, b_y, d_y, -1);
			} else {
				obj10 = new Class30_Sub2_Sub4_Sub5(objId, 0, 4, a_y, (byte)7, b_y, k2, d_y, class46.animation, true);
			}
			class25.method283(l2, regionY, j1, -460, plane, 0, c_y, ((Class30_Sub2_Sub4) (obj10)), regionX, byte0, 0, 768, l2);
		}
	}

	private static final int method176(int i, int j, int k) {
		int l = i / k;
		int i1 = i & k - 1;
		int j1 = j / k;
		int k1 = j & k - 1;
		int l1 = method186(l, j1);
		int i2 = method186(l + 1, j1);
		int j2 = method186(l, j1 + 1);
		int k2 = method186(l + 1, j1 + 1);
		int l2 = method184(l1, i2, i1, k);
		int i3 = method184(j2, k2, i1, k);
		return method184(l2, i3, k1, k);
	}

	private final int method177(int i, int j, int k) {
		if(k > 179) {
			j /= 2;
		}
		if(k > 192) {
			j /= 2;
		}
		if(k > 217) {
			j /= 2;
		}
		if(k > 243) {
			j /= 2;
		}
		int l = (i / 4 << 10) + (j / 32 << 7) + k / 2;
		return l;
	}

	public static final boolean method178(int i, int j, int k) {
		ObjectDefinition class46 = ObjectDefinition.forID(i);
		if(k != 8) {
			for(int l = 1; l > 0; l++) { }
		}
		if(j == 11) {
			j = 10;
		}
		if(j >= 5 && j <= 8) {
			j = 4;
		}
		return class46.method577(j, true);
	}

	public final void method179(int i, int j, Class11 aclass11[], int k, int l, int i1, byte abyte0[],
		int j1, int k1, int l1) {
		for(int i2 = 0; i2 < 8; i2++) {
			for(int j2 = 0; j2 < 8; j2++) {
				if(l + i2 > 0 && l + i2 < 103 && l1 + j2 > 0 && l1 + j2 < 103) {
					aclass11[k1].anIntArrayArray294[l + i2][l1 + j2] &= 0xfeffffff;
				}
			}

		}

		if(k < 9 || k > 9) {
			for(int k2 = 1; k2 > 0; k2++) { }
		}
		Stream class30_sub2_sub2 = new Stream(abyte0, 891);
		for(int l2 = 0; l2 < 4; l2++) {
			for(int i3 = 0; i3 < 64; i3++) {
				for(int j3 = 0; j3 < 64; j3++) {
					if(l2 == i && i3 >= i1 && i3 < i1 + 8 && j3 >= j1 && j3 < j1 + 8) {
						method181(l1 + Class4.method156(j3 & 7, j, -383, i3 & 7), 0, class30_sub2_sub2, l + Class4.method155(j, j3 & 7, i3 & 7, false), k1, j, 942, 0);
					} else {
						method181(-1, 0, class30_sub2_sub2, -1, 0, 0, 942, 0);
					}
				}

			}

		}

	}

	public final void method180(byte abyte0[], int i, int j, int k, int l, byte byte0, Class11 aclass11[]) {
		for(int i1 = 0; i1 < 4; i1++) {
			for(int j1 = 0; j1 < 64; j1++) {
				for(int k1 = 0; k1 < 64; k1++) {
					if(j + j1 > 0 && j + j1 < 103 && i + k1 > 0 && i + k1 < 103) {
						aclass11[i1].anIntArrayArray294[j + j1][i + k1] &= 0xfeffffff;
					}
				}

			}

		}

		Stream class30_sub2_sub2 = new Stream(abyte0, 891);
		for(int l1 = 0; l1 < 4; l1++) {
			for(int i2 = 0; i2 < 64; i2++) {
				for(int j2 = 0; j2 < 64; j2++) {
					method181(j2 + i, l, class30_sub2_sub2, i2 + j, l1, 0, 942, k);
				}

			}

		}

		if(byte0 != 4) {
			aBoolean143 = !aBoolean143;
		}
	}

	private final void method181(int i, int j, Stream class30_sub2_sub2, int k, int l, int i1, int j1,
								 int k1) {
		j1 = 36 / j1;
		if(k >= 0 && k < 104 && i >= 0 && i < 104) {
			aByteArrayArrayArray149[l][k][i] = 0;
			do
			{
				int l1 = class30_sub2_sub2.method408();
				if(l1 == 0) {
					if(l == 0) {
						tileHeights[0][k][i] = -method172(0xe3b7b + k + k1, 0x87cce + i + j) * 8;
						return;
					} else {
						tileHeights[l][k][i] = tileHeights[l - 1][k][i] - 240;
						return;
					}
				}
				if(l1 == 1) {
					int j2 = class30_sub2_sub2.method408();
					if(j2 == 1) {
						j2 = 0;
					}
					if(l == 0) {
						tileHeights[0][k][i] = -j2 * 8;
						return;
					} else {
						tileHeights[l][k][i] = tileHeights[l - 1][k][i] - j2 * 8;
						return;
					}
				}
				if(l1 <= 49) {
					aByteArrayArrayArray130[l][k][i] = class30_sub2_sub2.method409();
					aByteArrayArrayArray136[l][k][i] = (byte)((l1 - 2) / 4);
					aByteArrayArrayArray148[l][k][i] = (byte)((l1 - 2) + i1 & 3);
				} else
					if(l1 <= 81) {
					aByteArrayArrayArray149[l][k][i] = (byte)(l1 - 49);
					} else {
					aByteArrayArrayArray142[l][k][i] = (byte)(l1 - 81);
					}
			} while(true);
		}
		do
		{
			int i2 = class30_sub2_sub2.method408();
			if(i2 == 0) {
				break;
			}
			if(i2 == 1) {
				class30_sub2_sub2.method408();
				return;
			}
			if(i2 <= 49) {
				class30_sub2_sub2.method408();
			}
		} while(true);
	}

	public int method182(int i, int j, int k, int l) {
		if(l != 0) {
			return 2;
		}
		if((aByteArrayArrayArray149[j][k][i] & 8) != 0) {
			return 0;
		}
		if(j > 0 && (aByteArrayArrayArray149[1][k][i] & 2) != 0) {
			return j - 1;
		} else {
			return j;
		}
	}

	public final void method183(Class11 aclass11[], Class25 class25, int i, int j, int k, boolean flag, int l,
		byte abyte0[], int i1, int j1, int k1) {
		label0:
		{
			Stream class30_sub2_sub2 = new Stream(abyte0, 891);
			int l1 = -1;
			if(!flag) {
				aBoolean143 = !aBoolean143;
			}
			do
			{
				int i2 = class30_sub2_sub2.method422();
				if(i2 == 0) {
					break label0;
				}
				l1 += i2;
				int j2 = 0;
				do
				{
					int k2 = class30_sub2_sub2.method422();
					if(k2 == 0) {
						break;
					}
					j2 += k2 - 1;
					int l2 = j2 & 0x3f;
					int i3 = j2 >> 6 & 0x3f;
					int j3 = j2 >> 12;
					int k3 = class30_sub2_sub2.method408();
					int l3 = k3 >> 2;
					int i4 = k3 & 3;
					if(j3 == i && i3 >= i1 && i3 < i1 + 8 && l2 >= k && l2 < k + 8) {
						ObjectDefinition class46 = ObjectDefinition.forID(l1);
						int j4 = j + Class4.method157(j1, class46.anInt761, i3 & 7, (byte)113, l2 & 7, class46.anInt744);
						int k4 = k1 + Class4.method158(-433, l2 & 7, class46.anInt761, j1, class46.anInt744, i3 & 7);
						if(j4 > 0 && k4 > 0 && j4 < 103 && k4 < 103) {
							int l4 = j3;
							if((aByteArrayArrayArray149[1][j4][k4] & 2) == 2) {
								l4--;
							}
							Class11 class11 = null;
							if(l4 >= 0) {
								class11 = aclass11[l4];
							}
							method175(k4, class25, class11, l3, l, j4, l1, false, i4 + j1 & 3);
						}
					}
				} while(true);
			} while(true);
		}
	}

	private static final int method184(int i, int j, int k, int l) {
		int i1 = 0x10000 - Class30_Sub2_Sub1_Sub3.anIntArray1471[(k * 1024) / l] >> 1;
		return (i * (0x10000 - i1) >> 16) + (j * i1 >> 16);
	}

	private final int method185(int i, int j) {
		if(i == -2) {
			return 0xbc614e;
		}
		if(i == -1) {
			if(j < 0) {
				j = 0;
			} else
				if(j > 127) {
				j = 127;
				}
			j = 127 - j;
			return j;
		}
		j = (j * (i & 0x7f)) / 128;
		if(j < 2) {
			j = 2;
		} else
			if(j > 126) {
			j = 126;
			}
		return (i & 0xff80) + j;
	}

	private static final int method186(int i, int j) {
		int k = method170(i - 1, j - 1) + method170(i + 1, j - 1) + method170(i - 1, j + 1) + method170(i + 1, j + 1);
		int l = method170(i - 1, j) + method170(i + 1, j) + method170(i, j - 1) + method170(i, j + 1);
		int i1 = method170(i, j);
		return k / 16 + l / 8 + i1 / 4;
	}

	private static final int method187(int i, int j) {
		if(i == -1) {
			return 0xbc614e;
		}
		j = (j * (i & 0x7f)) / 128;
		if(j < 2) {
			j = 2;
		} else
			if(j > 126) {
			j = 126;
			}
		return (i & 0xff80) + j;
	}

	public static final void method188(Class25 class25, int i, int j, int k, int l, Class11 class11, int ai[][][], int i1,
		int j1, int k1, byte byte0) {
		int l1 = ai[l][i1][j];
		int i2 = ai[l][i1 + 1][j];
		int j2 = ai[l][i1 + 1][j + 1];
		int k2 = ai[l][i1][j + 1];
		if(byte0 != 93) {
			anInt153 = -145;
		}
		int l2 = l1 + i2 + j2 + k2 >> 2;
		ObjectDefinition class46 = ObjectDefinition.forID(j1);
		//int i3 = i1 + (j << 7) + (j1 << 14) + 0x40000000;
		int i3 = i1 + (j << 7) + ((j1 << 14) & 32767) + 0x40000000;
		if(!class46.hasActions) {
			i3 += 0x80000000;
		}
		byte byte1 = (byte)((i << 6) + k);
		if(k == 22) {
			Object obj;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj = class46.method578(22, i, l1, i2, j2, k2, -1);
			} else {
				obj = new Class30_Sub2_Sub4_Sub5(j1, i, 22, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method280(k1, l2, j, 68, ((Class30_Sub2_Sub4) (obj)), byte1, i3, i1, i3);
			if(class46.aBoolean767 && class46.hasActions) {
				class11.method213(j, 0, i1);
			}
			return;
		}
		if(k == 10 || k == 11) {
			Object obj1;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj1 = class46.method578(10, i, l1, i2, j2, k2, -1);
			} else {
				obj1 = new Class30_Sub2_Sub4_Sub5(j1, i, 10, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			if(obj1 != null) {
				int j5 = 0;
				if(k == 11) {
					j5 += 256;
				}
				int k4;
				int i5;
				if(i == 1 || i == 3) {
					k4 = class46.anInt761;
					i5 = class46.anInt744;
				} else {
					k4 = class46.anInt744;
					i5 = class46.anInt761;
				}
				class25.method284(i3, byte1, l2, i5, ((Class30_Sub2_Sub4) (obj1)), k4, k1, j5, (byte)110, j, i1, i5);
			}
			if(class46.aBoolean767) {
				class11.method212(class46.aBoolean757, anInt138, class46.anInt744, class46.anInt761, i1, j, i);
			}
			return;
		}
		if(k >= 12) {
			Object obj2;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj2 = class46.method578(k, i, l1, i2, j2, k2, -1);
			} else {
				obj2 = new Class30_Sub2_Sub4_Sub5(j1, i, k, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method284(i3, byte1, l2, 1, ((Class30_Sub2_Sub4) (obj2)), 1, k1, 0, (byte)110, j, i1, i3);
			if(class46.aBoolean767) {
				class11.method212(class46.aBoolean757, anInt138, class46.anInt744, class46.anInt761, i1, j, i);
			}
			return;
		}
		if(k == 0) {
			Object obj3;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj3 = class46.method578(0, i, l1, i2, j2, k2, -1);
			} else {
				obj3 = new Class30_Sub2_Sub4_Sub5(j1, i, 0, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method282(anIntArray152[i], ((Class30_Sub2_Sub4) (obj3)), true, i3, j, byte1, i1, null, l2, 0, k1, i3);
			if(class46.aBoolean767) {
				class11.method211(j, i, i1, k, (byte)1, class46.aBoolean757);
			}
			return;
		}
		if(k == 1) {
			Object obj4;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj4 = class46.method578(1, i, l1, i2, j2, k2, -1);
			} else {
				obj4 = new Class30_Sub2_Sub4_Sub5(j1, i, 1, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method282(anIntArray140[i], ((Class30_Sub2_Sub4) (obj4)), true, i3, j, byte1, i1, null, l2, 0, k1, i3);
			if(class46.aBoolean767) {
				class11.method211(j, i, i1, k, (byte)1, class46.aBoolean757);
			}
			return;
		}
		if(k == 2) {
			int j3 = i + 1 & 3;
			Object obj11;
			Object obj12;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj11 = class46.method578(2, 4 + i, l1, i2, j2, k2, -1);
				obj12 = class46.method578(2, j3, l1, i2, j2, k2, -1);
			} else {
				obj11 = new Class30_Sub2_Sub4_Sub5(j1, 4 + i, 2, i2, (byte)7, j2, l1, k2, class46.animation, true);
				obj12 = new Class30_Sub2_Sub4_Sub5(j1, j3, 2, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method282(anIntArray152[i], ((Class30_Sub2_Sub4) (obj11)), true, i3, j, byte1, i1, ((Class30_Sub2_Sub4) (obj12)), l2, anIntArray152[j3], k1, j3);
			if(class46.aBoolean767) {
				class11.method211(j, i, i1, k, (byte)1, class46.aBoolean757);
			}
			return;
		}
		if(k == 3) {
			Object obj5;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj5 = class46.method578(3, i, l1, i2, j2, k2, -1);
			} else {
				obj5 = new Class30_Sub2_Sub4_Sub5(j1, i, 3, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method282(anIntArray140[i], ((Class30_Sub2_Sub4) (obj5)), true, i3, j, byte1, i1, null, l2, 0, k1, i3);
			if(class46.aBoolean767) {
				class11.method211(j, i, i1, k, (byte)1, class46.aBoolean757);
			}
			return;
		}
		if(k == 9) {
			Object obj6;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj6 = class46.method578(k, i, l1, i2, j2, k2, -1);
			} else {
				obj6 = new Class30_Sub2_Sub4_Sub5(j1, i, k, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method284(i3, byte1, l2, 1, ((Class30_Sub2_Sub4) (obj6)), 1, k1, 0, (byte)110, j, i1, i3);
			if(class46.aBoolean767) {
				class11.method212(class46.aBoolean757, anInt138, class46.anInt744, class46.anInt761, i1, j, i);
			}
			return;
		}
		if(class46.aBoolean762) {
			if(i == 1) {
				int k3 = k2;
				k2 = j2;
				j2 = i2;
				i2 = l1;
				l1 = k3;
			} else
				if(i == 2) {
				int l3 = k2;
				k2 = i2;
				i2 = l3;
				l3 = j2;
				j2 = l1;
				l1 = l3;
				} else
					if(i == 3) {
				int i4 = k2;
				k2 = l1;
				l1 = i2;
				i2 = j2;
				j2 = i4;
					}
		}
		if(k == 4) {
			Object obj7;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj7 = class46.method578(4, 0, l1, i2, j2, k2, -1);
			} else {
				obj7 = new Class30_Sub2_Sub4_Sub5(j1, 0, 4, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method283(i3, j, i * 512, -460, k1, 0, l2, ((Class30_Sub2_Sub4) (obj7)), i1, byte1, 0, anIntArray152[i], i3);
			return;
		}
		if(k == 5) {
			int j4 = 16;
			int l4 = class25.method300(k1, i1, j);
			if(l4 > 0) {
				j4 = ObjectDefinition.forID(class25.fetchWallObjectNewUID(k1, i1, j)/*k4 >> 14 & 0x7fff*/).anInt775;
			}
			Object obj13;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj13 = class46.method578(4, 0, l1, i2, j2, k2, -1);
			} else {
				obj13 = new Class30_Sub2_Sub4_Sub5(j1, 0, 4, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method283(i3, j, i * 512, -460, k1, anIntArray137[i] * j4, l2, ((Class30_Sub2_Sub4) (obj13)), i1, byte1, anIntArray144[i] * j4, anIntArray152[i], l4);
			return;
		}
		if(k == 6) {
			Object obj8;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj8 = class46.method578(4, 0, l1, i2, j2, k2, -1);
			} else {
				obj8 = new Class30_Sub2_Sub4_Sub5(j1, 0, 4, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method283(i3, j, i, -460, k1, 0, l2, ((Class30_Sub2_Sub4) (obj8)), i1, byte1, 0, 256, i3);
			return;
		}
		if(k == 7) {
			Object obj9;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj9 = class46.method578(4, 0, l1, i2, j2, k2, -1);
			} else {
				obj9 = new Class30_Sub2_Sub4_Sub5(j1, 0, 4, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method283(i3, j, i, -460, k1, 0, l2, ((Class30_Sub2_Sub4) (obj9)), i1, byte1, 0, 512, i3);
			return;
		}
		if(k == 8) {
			Object obj10;
			if(class46.animation == -1 && class46.childrenIDs == null) {
				obj10 = class46.method578(4, 0, l1, i2, j2, k2, -1);
			} else {
				obj10 = new Class30_Sub2_Sub4_Sub5(j1, 0, 4, i2, (byte)7, j2, l1, k2, class46.animation, true);
			}
			class25.method283(i3, j, i, -460, k1, 0, l2, ((Class30_Sub2_Sub4) (obj10)), i1, byte1, 0, 768, i3);
		}
	}

	public static final boolean method189(int i, byte[] is, int i_250_, int i_251_) {
		if (i_251_ < 6 || i_251_ > 6)
			throw new NullPointerException();
		boolean bool = true;
		Stream class30_sub2_sub2 = new Stream(is, 891);
		int i_252_ = -1;
		for (;;) {
			int i_253_ = class30_sub2_sub2.method422();
			if (i_253_ == 0)
				break;
			i_252_ += i_253_;
			int i_254_ = 0;
			boolean bool_255_ = false;
			for (;;) {
				if (bool_255_) {
					int i_256_ = class30_sub2_sub2.method422();
					if (i_256_ == 0)
						break;
					class30_sub2_sub2.method408();
				} else {
					int i_257_ = class30_sub2_sub2.method422();
					if (i_257_ == 0)
						break;
					i_254_ += i_257_ - 1;
					int i_258_ = i_254_ & 0x3f;
					int i_259_ = i_254_ >> 6 & 0x3f;
					int i_260_ = class30_sub2_sub2.method408() >> 2;
					int i_261_ = i_259_ + i;
					int i_262_ = i_258_ + i_250_;
					if (i_261_ > 0 && i_262_ > 0 && i_261_ < 103 && i_262_ < 103) {
						ObjectDefinition class46 = ObjectDefinition.forID(i_252_);
						if (i_260_ != 22 || !aBoolean151 || class46.hasActions || class46.aBoolean736) {
							bool &= class46.method579(true);
							bool_255_ = true;
						}
					}
				}
			}
		}
		return bool;
	}

	public final void method190(int i, Class11 aclass11[], int j, int k, Class25 class25, byte abyte0[]) {
		label0:
		{
			if(k < 7 || k > 7) {
				return;
			}
			Stream class30_sub2_sub2 = new Stream(abyte0, 891);
			int l = -1;
			do {
				int i1 = class30_sub2_sub2.method422();
				if(i1 == 0) {
					break label0;
				}
				l += i1;
				int j1 = 0;
				do {
					int k1 = class30_sub2_sub2.method422();
					if(k1 == 0) {
						break;
					}
					j1 += k1 - 1;
					int l1 = j1 & 0x3f;
					int i2 = j1 >> 6 & 0x3f;
					int j2 = j1 >> 12;
					int k2 = class30_sub2_sub2.method408();
					int l2 = k2 >> 2;
					int i3 = k2 & 3;
					int j3 = i2 + i;
					int k3 = l1 + j;
					if(j3 > 0 && k3 > 0 && j3 < 103 && k3 < 103) {
						int l3 = j2;
						if((aByteArrayArrayArray149[1][j3][k3] & 2) == 2) {
							l3--;
						}
						Class11 class11 = null;
						if(l3 >= 0) {
							class11 = aclass11[l3];
						}
						method175(k3, class25, class11, l2, j2, j3, l, false, i3);
					}
				} while(true);
			} while(true);
		}
	}
}