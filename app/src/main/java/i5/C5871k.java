package i5;

/* renamed from: i5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5871k {

    /* renamed from: a, reason: collision with root package name */
    private final int f36594a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36595b;

    public C5871k(int i8, int i9) {
        if (i8 <= i9) {
            this.f36594a = i8;
            this.f36595b = i9;
            return;
        }
        throw new IllegalArgumentException("end position (= " + i9 + ") is smaller than start position (=" + i8 + ")");
    }

    public boolean a(int i8) {
        return i8 >= this.f36594a && i8 <= this.f36595b;
    }

    protected String b() {
        return "ItemDraggableRange";
    }

    public int c() {
        return this.f36595b;
    }

    public int d() {
        return this.f36594a;
    }

    public String toString() {
        return b() + "{mStart=" + this.f36594a + ", mEnd=" + this.f36595b + '}';
    }
}
