package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ki0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3191ki0 extends AbstractC4496wh0 {

    /* renamed from: x, reason: collision with root package name */
    static final AbstractC4496wh0 f24076x = new C3191ki0(null, new Object[0], 0);

    /* renamed from: u, reason: collision with root package name */
    private final transient Object f24077u;

    /* renamed from: v, reason: collision with root package name */
    final transient Object[] f24078v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f24079w;

    private C3191ki0(Object obj, Object[] objArr, int i8) {
        this.f24077u = obj;
        this.f24078v = objArr;
        this.f24079w = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static C3191ki0 k(int i8, Object[] objArr, C4387vh0 c4387vh0) {
        short[] sArr;
        char c8;
        char c9;
        Object[] objArr2;
        int i9 = i8;
        Object[] objArr3 = objArr;
        if (i9 == 0) {
            return (C3191ki0) f24076x;
        }
        Object obj = null;
        int i10 = 1;
        if (i9 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            AbstractC1659Pg0.b(obj2, obj3);
            return new C3191ki0(null, objArr3, 1);
        }
        AbstractC1762Sf0.b(i9, objArr3.length >> 1, "index");
        int p8 = AbstractC4714yh0.p(i8);
        if (i9 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            AbstractC1659Pg0.b(obj4, obj5);
            i9 = 1;
            c8 = 1;
            c9 = 2;
        } else {
            int i11 = p8 - 1;
            char c10 = 65535;
            if (p8 <= 128) {
                byte[] bArr = new byte[p8];
                Arrays.fill(bArr, (byte) -1);
                int i12 = 0;
                int i13 = 0;
                while (i12 < i9) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    Object obj6 = objArr3[i15];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i15 ^ i10];
                    Objects.requireNonNull(obj7);
                    AbstractC1659Pg0.b(obj6, obj7);
                    int a8 = AbstractC3298lh0.a(obj6.hashCode());
                    while (true) {
                        int i16 = a8 & i11;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            bArr[i16] = (byte) i14;
                            if (i13 < i12) {
                                objArr3[i14] = obj6;
                                objArr3[i14 ^ 1] = obj7;
                            }
                            i13++;
                        } else {
                            if (obj6.equals(objArr3[i17])) {
                                int i18 = i17 ^ 1;
                                Object obj8 = objArr3[i18];
                                Objects.requireNonNull(obj8);
                                C4278uh0 c4278uh0 = new C4278uh0(obj6, obj7, obj8);
                                objArr3[i18] = obj7;
                                obj = c4278uh0;
                                break;
                            }
                            a8 = i16 + 1;
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 == i9) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i13), obj};
                    c9 = 2;
                    c8 = 1;
                }
            } else {
                if (p8 <= 32768) {
                    sArr = new short[p8];
                    Arrays.fill(sArr, (short) -1);
                    int i19 = 0;
                    for (int i20 = 0; i20 < i9; i20++) {
                        int i21 = i19 + i19;
                        int i22 = i20 + i20;
                        Object obj9 = objArr3[i22];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i22 ^ 1];
                        Objects.requireNonNull(obj10);
                        AbstractC1659Pg0.b(obj9, obj10);
                        int a9 = AbstractC3298lh0.a(obj9.hashCode());
                        while (true) {
                            int i23 = a9 & i11;
                            char c11 = (char) sArr[i23];
                            if (c11 == 65535) {
                                sArr[i23] = (short) i21;
                                if (i19 < i20) {
                                    objArr3[i21] = obj9;
                                    objArr3[i21 ^ 1] = obj10;
                                }
                                i19++;
                            } else {
                                if (obj9.equals(objArr3[c11])) {
                                    int i24 = c11 ^ 1;
                                    Object obj11 = objArr3[i24];
                                    Objects.requireNonNull(obj11);
                                    C4278uh0 c4278uh02 = new C4278uh0(obj9, obj10, obj11);
                                    objArr3[i24] = obj10;
                                    obj = c4278uh02;
                                    break;
                                }
                                a9 = i23 + 1;
                            }
                        }
                    }
                    if (i19 != i9) {
                        Integer valueOf = Integer.valueOf(i19);
                        c8 = 1;
                        c9 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i25 = 1;
                    sArr = new int[p8];
                    Arrays.fill((int[]) sArr, -1);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i9) {
                        int i28 = i27 + i27;
                        int i29 = i26 + i26;
                        Object obj12 = objArr3[i29];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i29 ^ i25];
                        Objects.requireNonNull(obj13);
                        AbstractC1659Pg0.b(obj12, obj13);
                        int a10 = AbstractC3298lh0.a(obj12.hashCode());
                        while (true) {
                            int i30 = a10 & i11;
                            ?? r15 = sArr[i30];
                            if (r15 == c10) {
                                sArr[i30] = i28;
                                if (i27 < i26) {
                                    objArr3[i28] = obj12;
                                    objArr3[i28 ^ 1] = obj13;
                                }
                                i27++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i31 = r15 ^ 1;
                                    Object obj14 = objArr3[i31];
                                    Objects.requireNonNull(obj14);
                                    C4278uh0 c4278uh03 = new C4278uh0(obj12, obj13, obj14);
                                    objArr3[i31] = obj13;
                                    obj = c4278uh03;
                                    break;
                                }
                                a10 = i30 + 1;
                                c10 = 65535;
                            }
                        }
                        i26++;
                        i25 = 1;
                        c10 = 65535;
                    }
                    if (i27 != i9) {
                        c8 = 1;
                        c9 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i27), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c8 = 1;
            }
            c9 = 2;
            c8 = 1;
        }
        boolean z7 = obj instanceof Object[];
        Object obj15 = obj;
        if (z7) {
            Object[] objArr4 = (Object[]) obj;
            C4278uh0 c4278uh04 = (C4278uh0) objArr4[c9];
            if (c4387vh0 == null) {
                throw c4278uh04.a();
            }
            c4387vh0.f27324c = c4278uh04;
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[c8]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i9 = intValue;
        }
        return new C3191ki0(obj15, objArr3, i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4496wh0
    final AbstractC3625oh0 a() {
        return new C3082ji0(this.f24078v, 1, this.f24079w);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4496wh0
    final AbstractC4714yh0 g() {
        return new C2866hi0(this, this.f24078v, 0, this.f24079w);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.ads.AbstractC4496wh0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.f24079w
            java.lang.Object[] r2 = r9.f24078v
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            j$.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            j$.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.f24077u
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.AbstractC3298lh0.a(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.AbstractC3298lh0.a(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.AbstractC3298lh0.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3191ki0.get(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4496wh0
    final AbstractC4714yh0 h() {
        return new C2974ii0(this, new C3082ji0(this.f24078v, 0, this.f24079w));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f24079w;
    }
}
