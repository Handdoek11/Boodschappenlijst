package Y4;

import android.content.Context;
import android.content.SharedPreferences;
import g4.C5807c;
import java.util.UUID;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final C5807c f6108b = C5807c.e(j.class).b(g4.r.l(g.class)).b(g4.r.l(Context.class)).f(new g4.h() { // from class: Y4.v
        @Override // g4.h
        public final Object a(g4.e eVar) {
            return new j((Context) eVar.a(Context.class));
        }
    }).d();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6109a;

    public j(Context context) {
        this.f6109a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    protected final SharedPreferences b() {
        return this.f6109a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
