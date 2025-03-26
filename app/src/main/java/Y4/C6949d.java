package y4;

import Z2.C0766e;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.c;

/* renamed from: y4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6949d extends com.google.android.gms.common.api.b {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f44583k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0225a f44584l;

    /* renamed from: m, reason: collision with root package name */
    static final com.google.android.gms.common.api.a f44585m;

    /* renamed from: y4.d$a */
    class a extends a.AbstractC0225a {
        a() {
        }

        @Override // com.google.android.gms.common.api.a.AbstractC0225a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6950e b(Context context, Looper looper, C0766e c0766e, a.d.C0226a c0226a, c.a aVar, c.b bVar) {
            return new C6950e(context, looper, c0766e, aVar, bVar);
        }
    }

    static {
        a.g gVar = new a.g();
        f44583k = gVar;
        a aVar = new a();
        f44584l = aVar;
        f44585m = new com.google.android.gms.common.api.a("DynamicLinks.API", aVar, gVar);
    }

    public C6949d(Context context) {
        super(context, f44585m, a.d.f13231a, b.a.f13242c);
    }
}
