package h2;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5828b extends AbstractC5833g {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f36209a;

    C5828b(Integer num) {
        this.f36209a = num;
    }

    @Override // h2.AbstractC5833g
    public Integer a() {
        return this.f36209a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5833g)) {
            return false;
        }
        Integer num = this.f36209a;
        Integer a8 = ((AbstractC5833g) obj).a();
        return num == null ? a8 == null : num.equals(a8);
    }

    public int hashCode() {
        Integer num = this.f36209a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f36209a + "}";
    }
}
