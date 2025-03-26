package q;

import J6.AbstractC0650j;
import y6.AbstractC6980h;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6401e {

    /* renamed from: a, reason: collision with root package name */
    private int[] f40865a;

    /* renamed from: b, reason: collision with root package name */
    private int f40866b;

    /* renamed from: c, reason: collision with root package name */
    private int f40867c;

    /* renamed from: d, reason: collision with root package name */
    private int f40868d;

    public C6401e() {
        this(0, 1, null);
    }

    private final void c() {
        int[] iArr = this.f40865a;
        int length = iArr.length;
        int i8 = this.f40866b;
        int i9 = length - i8;
        int i10 = length << 1;
        if (i10 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i10];
        AbstractC6980h.e(iArr, iArr2, 0, i8, length);
        AbstractC6980h.e(this.f40865a, iArr2, i9, 0, this.f40866b);
        this.f40865a = iArr2;
        this.f40866b = 0;
        this.f40867c = length;
        this.f40868d = i10 - 1;
    }

    public final void a(int i8) {
        int[] iArr = this.f40865a;
        int i9 = this.f40867c;
        iArr[i9] = i8;
        int i10 = this.f40868d & (i9 + 1);
        this.f40867c = i10;
        if (i10 == this.f40866b) {
            c();
        }
    }

    public final void b() {
        this.f40867c = this.f40866b;
    }

    public final boolean d() {
        return this.f40866b == this.f40867c;
    }

    public final int e() {
        int i8 = this.f40866b;
        if (i8 == this.f40867c) {
            C6402f c6402f = C6402f.f40869a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = this.f40865a[i8];
        this.f40866b = (i8 + 1) & this.f40868d;
        return i9;
    }

    public C6401e(int i8) {
        if (i8 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i8 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i8 = Integer.bitCount(i8) != 1 ? Integer.highestOneBit(i8 - 1) << 1 : i8;
        this.f40868d = i8 - 1;
        this.f40865a = new int[i8];
    }

    public /* synthetic */ C6401e(int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? 8 : i8);
    }
}
