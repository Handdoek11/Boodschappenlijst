package S;

import J6.AbstractC0650j;
import com.adadapted.android.sdk.core.device.DeviceInfo;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4970b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f4971c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f4972d = d(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f4973e = d(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f4974f = d(3);

    /* renamed from: g, reason: collision with root package name */
    private static final int f4975g = d(4);

    /* renamed from: h, reason: collision with root package name */
    private static final int f4976h = d(5);

    /* renamed from: i, reason: collision with root package name */
    private static final int f4977i = d(6);

    /* renamed from: a, reason: collision with root package name */
    private final int f4978a;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final int a() {
            return c.f4973e;
        }

        public final int b() {
            return c.f4975g;
        }

        private a() {
        }
    }

    private /* synthetic */ c(int i8) {
        this.f4978a = i8;
    }

    public static final /* synthetic */ c c(int i8) {
        return new c(i8);
    }

    public static boolean e(int i8, Object obj) {
        return (obj instanceof c) && i8 == ((c) obj).i();
    }

    public static final boolean f(int i8, int i9) {
        return i8 == i9;
    }

    public static String h(int i8) {
        return f(i8, f4971c) ? "Button" : f(i8, f4972d) ? "Checkbox" : f(i8, f4973e) ? "Switch" : f(i8, f4974f) ? "RadioButton" : f(i8, f4975g) ? "Tab" : f(i8, f4976h) ? "Image" : f(i8, f4977i) ? "DropdownList" : DeviceInfo.UNKNOWN_VALUE;
    }

    public boolean equals(Object obj) {
        return e(this.f4978a, obj);
    }

    public int hashCode() {
        return g(this.f4978a);
    }

    public final /* synthetic */ int i() {
        return this.f4978a;
    }

    public String toString() {
        return h(this.f4978a);
    }

    private static int d(int i8) {
        return i8;
    }

    public static int g(int i8) {
        return i8;
    }
}
