package N0;

import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f4033a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f4034b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f4035c;

    private b() {
        try {
            f4035c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f4034b == null) {
            synchronized (f4033a) {
                try {
                    if (f4034b == null) {
                        f4034b = new b();
                    }
                } finally {
                }
            }
        }
        return f4034b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f4035c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
