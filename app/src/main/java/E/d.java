package e;

import J6.AbstractC0650j;
import J6.r;
import android.content.Context;
import android.content.Intent;
import d.C5694a;
import d.g;

/* loaded from: classes.dex */
public final class d extends AbstractC5734a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35288a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    @Override // e.AbstractC5734a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, g gVar) {
        r.e(context, "context");
        r.e(gVar, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
        r.d(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    @Override // e.AbstractC5734a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5694a c(int i8, Intent intent) {
        return new C5694a(i8, intent);
    }
}
