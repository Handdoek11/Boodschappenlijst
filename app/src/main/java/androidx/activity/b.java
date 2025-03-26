package androidx.activity;

import J6.AbstractC0650j;
import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6631e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f6632a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6633b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6634c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6635d;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public b(float f8, float f9, float f10, int i8) {
        this.f6632a = f8;
        this.f6633b = f9;
        this.f6634c = f10;
        this.f6635d = i8;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f6632a + ", touchY=" + this.f6633b + ", progress=" + this.f6634c + ", swipeEdge=" + this.f6635d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BackEvent backEvent) {
        J6.r.e(backEvent, "backEvent");
        androidx.activity.a aVar = androidx.activity.a.f6630a;
        this(aVar.d(backEvent), aVar.e(backEvent), aVar.b(backEvent), aVar.c(backEvent));
    }
}
