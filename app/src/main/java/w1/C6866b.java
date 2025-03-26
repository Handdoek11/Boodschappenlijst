package w1;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6866b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f44237a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44238b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44239c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44240d;

    public C6866b(boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f44237a = z7;
        this.f44238b = z8;
        this.f44239c = z9;
        this.f44240d = z10;
    }

    public boolean a() {
        return this.f44237a;
    }

    public boolean b() {
        return this.f44239c;
    }

    public boolean c() {
        return this.f44240d;
    }

    public boolean d() {
        return this.f44238b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6866b)) {
            return false;
        }
        C6866b c6866b = (C6866b) obj;
        return this.f44237a == c6866b.f44237a && this.f44238b == c6866b.f44238b && this.f44239c == c6866b.f44239c && this.f44240d == c6866b.f44240d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f44237a;
        int i8 = r02;
        if (this.f44238b) {
            i8 = r02 + 16;
        }
        int i9 = i8;
        if (this.f44239c) {
            i9 = i8 + 256;
        }
        return this.f44240d ? i9 + 4096 : i9;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f44237a), Boolean.valueOf(this.f44238b), Boolean.valueOf(this.f44239c), Boolean.valueOf(this.f44240d));
    }
}
