package androidx.privacysandbox.ads.adservices.topics;

import J6.AbstractC0650j;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10699a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final d a(Context context) {
            J6.r.e(context, "context");
            V0.b bVar = V0.b.f5503a;
            if (bVar.a() >= 5) {
                return new l(context);
            }
            if (bVar.a() == 4) {
                return new g(context);
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, A6.d dVar);
}
