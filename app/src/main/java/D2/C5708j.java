package d2;

/* renamed from: d2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5708j {

    /* renamed from: a, reason: collision with root package name */
    private Class f35227a;

    /* renamed from: b, reason: collision with root package name */
    private Class f35228b;

    /* renamed from: c, reason: collision with root package name */
    private Class f35229c;

    public C5708j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f35227a = cls;
        this.f35228b = cls2;
        this.f35229c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5708j c5708j = (C5708j) obj;
        return this.f35227a.equals(c5708j.f35227a) && this.f35228b.equals(c5708j.f35228b) && AbstractC5710l.d(this.f35229c, c5708j.f35229c);
    }

    public int hashCode() {
        int hashCode = ((this.f35227a.hashCode() * 31) + this.f35228b.hashCode()) * 31;
        Class cls = this.f35229c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f35227a + ", second=" + this.f35228b + '}';
    }

    public C5708j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
