package androidx.compose.runtime.snapshots;

import I6.p;
import J6.AbstractC0650j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.k;
import x6.C6916E;
import y6.AbstractC6980h;
import y6.AbstractC6987o;
import z.AbstractC6992a;
import z.AbstractC6994c;

/* loaded from: classes.dex */
public final class d implements Iterable, K6.a {

    /* renamed from: v, reason: collision with root package name */
    public static final a f8098v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    private static final d f8099w = new d(0, 0, 0, null);

    /* renamed from: o, reason: collision with root package name */
    private final long f8100o;

    /* renamed from: s, reason: collision with root package name */
    private final long f8101s;

    /* renamed from: t, reason: collision with root package name */
    private final int f8102t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f8103u;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final d a() {
            return d.f8099w;
        }

        private a() {
        }
    }

    static final class b extends k implements p {

        /* renamed from: s, reason: collision with root package name */
        Object f8104s;

        /* renamed from: t, reason: collision with root package name */
        int f8105t;

        /* renamed from: u, reason: collision with root package name */
        int f8106u;

        /* renamed from: v, reason: collision with root package name */
        int f8107v;

        /* renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f8108w;

        b(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f8108w = obj;
            return bVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(R6.f fVar, A6.d dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:43:0x00ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:42:0x00e9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private d(long j8, long j9, int i8, int[] iArr) {
        this.f8100o = j8;
        this.f8101s = j9;
        this.f8102t = i8;
        this.f8103u = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return R6.g.b(new b(null)).iterator();
    }

    public final d o(int i8) {
        int[] iArr;
        int b8;
        int i9 = this.f8102t;
        int i10 = i8 - i9;
        if (i10 >= 0 && i10 < 64) {
            long j8 = 1 << i10;
            long j9 = this.f8101s;
            if ((j9 & j8) != 0) {
                return new d(this.f8100o, j9 & (~j8), i9, this.f8103u);
            }
        } else if (i10 >= 64 && i10 < 128) {
            long j10 = 1 << (i10 - 64);
            long j11 = this.f8100o;
            if ((j11 & j10) != 0) {
                return new d(j11 & (~j10), this.f8101s, i9, this.f8103u);
            }
        } else if (i10 < 0 && (iArr = this.f8103u) != null && (b8 = AbstractC6994c.b(iArr, i8)) >= 0) {
            int length = iArr.length;
            int i11 = length - 1;
            if (i11 == 0) {
                return new d(this.f8100o, this.f8101s, this.f8102t, null);
            }
            int[] iArr2 = new int[i11];
            if (b8 > 0) {
                AbstractC6980h.e(iArr, iArr2, 0, 0, b8);
            }
            if (b8 < i11) {
                AbstractC6980h.e(iArr, iArr2, b8, b8 + 1, length);
            }
            return new d(this.f8100o, this.f8101s, this.f8102t, iArr2);
        }
        return this;
    }

    public final boolean p(int i8) {
        int[] iArr;
        int i9 = i8 - this.f8102t;
        if (i9 >= 0 && i9 < 64) {
            return ((1 << i9) & this.f8101s) != 0;
        }
        if (i9 >= 64 && i9 < 128) {
            return ((1 << (i9 - 64)) & this.f8100o) != 0;
        }
        if (i9 <= 0 && (iArr = this.f8103u) != null) {
            return AbstractC6994c.b(iArr, i8) >= 0;
        }
        return false;
    }

    public final int q(int i8) {
        int[] iArr = this.f8103u;
        if (iArr != null) {
            return iArr[0];
        }
        long j8 = this.f8101s;
        if (j8 != 0) {
            return this.f8102t + AbstractC6994c.c(j8);
        }
        long j9 = this.f8100o;
        return j9 != 0 ? this.f8102t + 64 + AbstractC6994c.c(j9) : i8;
    }

    public final d r(int i8) {
        int i9;
        int[] iArr;
        int i10 = this.f8102t;
        int i11 = i8 - i10;
        long j8 = 0;
        if (i11 >= 0 && i11 < 64) {
            long j9 = 1 << i11;
            long j10 = this.f8101s;
            if ((j10 & j9) == 0) {
                return new d(this.f8100o, j10 | j9, i10, this.f8103u);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j11 = 1 << (i11 - 64);
            long j12 = this.f8100o;
            if ((j12 & j11) == 0) {
                return new d(j12 | j11, this.f8101s, i10, this.f8103u);
            }
        } else if (i11 < 128) {
            int[] iArr2 = this.f8103u;
            if (iArr2 == null) {
                return new d(this.f8100o, this.f8101s, i10, new int[]{i8});
            }
            int b8 = AbstractC6994c.b(iArr2, i8);
            if (b8 < 0) {
                int i12 = -(b8 + 1);
                int length = iArr2.length;
                int[] iArr3 = new int[length + 1];
                AbstractC6980h.e(iArr2, iArr3, 0, 0, i12);
                AbstractC6980h.e(iArr2, iArr3, i12 + 1, i12, length);
                iArr3[i12] = i8;
                return new d(this.f8100o, this.f8101s, this.f8102t, iArr3);
            }
        } else if (!p(i8)) {
            long j13 = this.f8100o;
            long j14 = this.f8101s;
            int i13 = this.f8102t;
            int i14 = ((i8 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j15 = j14;
            long j16 = j13;
            while (true) {
                if (i13 >= i14) {
                    i9 = i13;
                    break;
                }
                if (j15 != j8) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.f8103u;
                        if (iArr4 != null) {
                            for (int i15 : iArr4) {
                                arrayList.add(Integer.valueOf(i15));
                            }
                        }
                    }
                    for (int i16 = 0; i16 < 64; i16++) {
                        if (((1 << i16) & j15) != 0) {
                            arrayList.add(Integer.valueOf(i16 + i13));
                        }
                    }
                    j8 = 0;
                }
                if (j16 == j8) {
                    i9 = i14;
                    j15 = j8;
                    break;
                }
                i13 += 64;
                j15 = j16;
                j16 = j8;
            }
            if (arrayList == null || (iArr = AbstractC6987o.Z(arrayList)) == null) {
                iArr = this.f8103u;
            }
            return new d(j16, j15, i9, iArr).r(i8);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC6987o.l(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(AbstractC6992a.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
