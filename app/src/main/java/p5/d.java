package p5;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f40835a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40836b;

    public d(int i8, int i9) {
        this.f40835a = i8;
        this.f40836b = i9;
    }

    public int a() {
        return this.f40836b;
    }

    public int b() {
        return this.f40835a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f40835a == dVar.f40835a && this.f40836b == dVar.f40836b;
    }

    public int hashCode() {
        return (this.f40835a * 31) + this.f40836b;
    }

    public String toString() {
        return "IndexPath{" + this.f40835a + ", " + this.f40836b + '}';
    }
}
