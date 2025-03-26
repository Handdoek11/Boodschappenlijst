package androidx.compose.foundation.layout;

import J6.AbstractC0650j;
import Q.y;
import s.EnumC6718a;

/* loaded from: classes.dex */
final class FillElement extends y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8041e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final EnumC6718a f8042b;

    /* renamed from: c, reason: collision with root package name */
    private final float f8043c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8044d;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final FillElement a(float f8) {
            return new FillElement(EnumC6718a.Vertical, f8, "fillMaxHeight");
        }

        public final FillElement b(float f8) {
            return new FillElement(EnumC6718a.Both, f8, "fillMaxSize");
        }

        public final FillElement c(float f8) {
            return new FillElement(EnumC6718a.Horizontal, f8, "fillMaxWidth");
        }

        private a() {
        }
    }

    public FillElement(EnumC6718a enumC6718a, float f8, String str) {
        this.f8042b = enumC6718a;
        this.f8043c = f8;
        this.f8044d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f8042b == fillElement.f8042b && this.f8043c == fillElement.f8043c;
    }

    public int hashCode() {
        return (this.f8042b.hashCode() * 31) + Float.floatToIntBits(this.f8043c);
    }
}
