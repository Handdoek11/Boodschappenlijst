package e;

import J6.AbstractC0650j;
import J6.r;
import android.content.Context;
import android.content.Intent;
import d.C5694a;

/* loaded from: classes.dex */
public final class c extends AbstractC5734a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35287a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    @Override // e.AbstractC5734a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        r.e(context, "context");
        r.e(intent, "input");
        return intent;
    }

    @Override // e.AbstractC5734a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5694a c(int i8, Intent intent) {
        return new C5694a(i8, intent);
    }
}
