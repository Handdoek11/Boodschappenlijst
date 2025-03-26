package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5927d {

    /* renamed from: a, reason: collision with root package name */
    protected final int f37639a;

    /* renamed from: b, reason: collision with root package name */
    protected int f37640b;

    /* renamed from: c, reason: collision with root package name */
    protected int f37641c;

    /* renamed from: d, reason: collision with root package name */
    protected long[] f37642d;

    public abstract void clear();

    protected AbstractC5927d() {
        this.f37639a = 4;
    }

    protected AbstractC5927d(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
        this.f37639a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i8 - 1));
    }

    public final long count() {
        int i8 = this.f37641c;
        if (i8 == 0) {
            return this.f37640b;
        }
        return this.f37642d[i8] + this.f37640b;
    }
}
