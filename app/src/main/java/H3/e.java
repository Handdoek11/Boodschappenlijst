package h3;

import android.content.Context;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f36218b = new e();

    /* renamed from: a, reason: collision with root package name */
    private d f36219a = null;

    public static d a(Context context) {
        return f36218b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f36219a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f36219a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36219a;
    }
}
