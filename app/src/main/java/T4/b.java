package T4;

import J6.AbstractC0650j;
import J6.r;
import T4.h;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    private static final a f5196b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f5197a;

    private static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public b(Context context) {
        r.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f5197a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // T4.h
    public Boolean a() {
        if (this.f5197a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f5197a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // T4.h
    public T6.a b() {
        if (this.f5197a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return T6.a.h(T6.c.s(this.f5197a.getInt("firebase_sessions_sessions_restart_timeout"), T6.d.f5307v));
        }
        return null;
    }

    @Override // T4.h
    public Double c() {
        if (this.f5197a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f5197a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // T4.h
    public Object d(A6.d dVar) {
        return h.a.a(this, dVar);
    }
}
