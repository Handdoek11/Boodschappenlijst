package r3;

import java.util.Arrays;

/* loaded from: classes.dex */
final class x extends AbstractC6698p {

    /* renamed from: x, reason: collision with root package name */
    static final AbstractC6698p f42602x = new x(null, new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    private final transient Object f42603u;

    /* renamed from: v, reason: collision with root package name */
    final transient Object[] f42604v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f42605w;

    private x(Object obj, Object[] objArr, int i8) {
        this.f42603u = obj;
        this.f42604v = objArr;
        this.f42605w = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static x h(int i8, Object[] objArr, C6697o c6697o) {
        int i9;
        short[] sArr;
        char c8;
        char c9;
        byte[] bArr;
        int i10 = i8;
        Object[] objArr2 = objArr;
        if (i10 == 0) {
            return (x) f42602x;
        }
        Object obj = null;
        int i11 = 1;
        if (i10 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            AbstractC6688f.a(obj2, obj3);
            return new x(null, objArr2, 1);
        }
        AbstractC6685c.b(i10, objArr2.length >> 1, "index");
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            i9 = Integer.highestOneBit(max - 1);
            do {
                i9 += i9;
            } while (i9 * 0.7d < max);
        } else {
            i9 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i10 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            AbstractC6688f.a(obj4, obj5);
            c8 = 1;
            c9 = 2;
        } else {
            int i12 = i9 - 1;
            char c10 = 65535;
            if (i9 <= 128) {
                byte[] bArr2 = new byte[i9];
                Arrays.fill(bArr2, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj6 = objArr2[i16];
                    obj6.getClass();
                    Object obj7 = objArr2[i16 ^ i11];
                    obj7.getClass();
                    AbstractC6688f.a(obj6, obj7);
                    int a8 = AbstractC6690h.a(obj6.hashCode());
                    while (true) {
                        int i17 = a8 & i12;
                        int i18 = bArr2[i17] & 255;
                        if (i18 == 255) {
                            bArr2[i17] = (byte) i15;
                            if (i14 < i13) {
                                objArr2[i15] = obj6;
                                objArr2[i15 ^ 1] = obj7;
                            }
                            i14++;
                        } else {
                            if (obj6.equals(objArr2[i18])) {
                                int i19 = i18 ^ 1;
                                Object obj8 = objArr2[i19];
                                obj8.getClass();
                                C6696n c6696n = new C6696n(obj6, obj7, obj8);
                                objArr2[i19] = obj7;
                                obj = c6696n;
                                break;
                            }
                            a8 = i17 + 1;
                        }
                    }
                    i13++;
                    i11 = 1;
                }
                if (i14 == i10) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i14), obj};
                    c9 = 2;
                    c8 = 1;
                    obj = bArr;
                }
            } else if (i9 <= 32768) {
                sArr = new short[i9];
                Arrays.fill(sArr, (short) -1);
                int i20 = 0;
                for (int i21 = 0; i21 < i10; i21++) {
                    int i22 = i20 + i20;
                    int i23 = i21 + i21;
                    Object obj9 = objArr2[i23];
                    obj9.getClass();
                    Object obj10 = objArr2[i23 ^ 1];
                    obj10.getClass();
                    AbstractC6688f.a(obj9, obj10);
                    int a9 = AbstractC6690h.a(obj9.hashCode());
                    while (true) {
                        int i24 = a9 & i12;
                        char c11 = (char) sArr[i24];
                        if (c11 == 65535) {
                            sArr[i24] = (short) i22;
                            if (i20 < i21) {
                                objArr2[i22] = obj9;
                                objArr2[i22 ^ 1] = obj10;
                            }
                            i20++;
                        } else {
                            if (obj9.equals(objArr2[c11])) {
                                int i25 = c11 ^ 1;
                                Object obj11 = objArr2[i25];
                                obj11.getClass();
                                C6696n c6696n2 = new C6696n(obj9, obj10, obj11);
                                objArr2[i25] = obj10;
                                obj = c6696n2;
                                break;
                            }
                            a9 = i24 + 1;
                        }
                    }
                }
                if (i20 != i10) {
                    c9 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i20), obj};
                    c8 = 1;
                }
                bArr = sArr;
            } else {
                int i26 = 1;
                sArr = new int[i9];
                Arrays.fill((int[]) sArr, -1);
                int i27 = 0;
                int i28 = 0;
                while (i27 < i10) {
                    int i29 = i28 + i28;
                    int i30 = i27 + i27;
                    Object obj12 = objArr2[i30];
                    obj12.getClass();
                    Object obj13 = objArr2[i30 ^ i26];
                    obj13.getClass();
                    AbstractC6688f.a(obj12, obj13);
                    int a10 = AbstractC6690h.a(obj12.hashCode());
                    while (true) {
                        int i31 = a10 & i12;
                        ?? r15 = sArr[i31];
                        if (r15 == c10) {
                            sArr[i31] = i29;
                            if (i28 < i27) {
                                objArr2[i29] = obj12;
                                objArr2[i29 ^ 1] = obj13;
                            }
                            i28++;
                        } else {
                            if (obj12.equals(objArr2[r15])) {
                                int i32 = r15 ^ 1;
                                Object obj14 = objArr2[i32];
                                obj14.getClass();
                                C6696n c6696n3 = new C6696n(obj12, obj13, obj14);
                                objArr2[i32] = obj13;
                                obj = c6696n3;
                                break;
                            }
                            a10 = i31 + 1;
                            c10 = 65535;
                        }
                    }
                    i27++;
                    i26 = 1;
                    c10 = 65535;
                }
                if (i28 != i10) {
                    c8 = 1;
                    c9 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i28), obj};
                }
                bArr = sArr;
            }
            c9 = 2;
            c8 = 1;
            obj = bArr;
        }
        boolean z7 = obj instanceof Object[];
        Object obj15 = obj;
        if (z7) {
            Object[] objArr3 = (Object[]) obj;
            C6696n c6696n4 = (C6696n) objArr3[c9];
            if (c6697o == null) {
                throw c6696n4.a();
            }
            c6697o.f42585c = c6696n4;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c8]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj15 = obj16;
            i10 = intValue;
        }
        return new x(obj15, objArr2, i10);
    }

    @Override // r3.AbstractC6698p
    final AbstractC6692j a() {
        return new C6704w(this.f42604v, 1, this.f42605w);
    }

    @Override // r3.AbstractC6698p
    final AbstractC6699q e() {
        return new C6702u(this, this.f42604v, 0, this.f42605w);
    }

    @Override // r3.AbstractC6698p
    final AbstractC6699q f() {
        return new C6703v(this, new C6704w(this.f42604v, 0, this.f42605w));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // r3.AbstractC6698p, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f42603u
            java.lang.Object[] r1 = r9.f42604v
            int r2 = r9.f42605w
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = r3.AbstractC6690h.a(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = r3.AbstractC6690h.a(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = r3.AbstractC6690h.a(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.x.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f42605w;
    }
}
