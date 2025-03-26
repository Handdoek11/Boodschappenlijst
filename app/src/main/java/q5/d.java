package Q5;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public enum d {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");


    /* renamed from: s, reason: collision with root package name */
    public static final a f4733s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final String f4741o;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final d a(int i8) {
            return d.values()[i8];
        }

        private a() {
        }
    }

    d(String str) {
        this.f4741o = str;
    }
}
