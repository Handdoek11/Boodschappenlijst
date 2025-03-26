package e;

import J6.AbstractC0650j;
import J6.r;
import P6.m;
import android.content.Context;
import android.content.Intent;
import e.AbstractC5734a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import o0.AbstractC6278a;
import x6.C6933o;
import x6.u;
import y6.AbstractC6971J;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class b extends AbstractC5734a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35286a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final Intent a(String[] strArr) {
            r.e(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            r.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private a() {
        }
    }

    @Override // e.AbstractC5734a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        r.e(context, "context");
        r.e(strArr, "input");
        return f35286a.a(strArr);
    }

    @Override // e.AbstractC5734a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC5734a.C0250a b(Context context, String[] strArr) {
        r.e(context, "context");
        r.e(strArr, "input");
        if (strArr.length == 0) {
            return new AbstractC5734a.C0250a(AbstractC6971J.e());
        }
        for (String str : strArr) {
            if (AbstractC6278a.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.c(AbstractC6971J.b(strArr.length), 16));
        for (String str2 : strArr) {
            C6933o a8 = u.a(str2, Boolean.TRUE);
            linkedHashMap.put(a8.c(), a8.d());
        }
        return new AbstractC5734a.C0250a(linkedHashMap);
    }

    @Override // e.AbstractC5734a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i8, Intent intent) {
        if (i8 != -1) {
            return AbstractC6971J.e();
        }
        if (intent == null) {
            return AbstractC6971J.e();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return AbstractC6971J.e();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i9 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i9 == 0));
        }
        return AbstractC6971J.k(AbstractC6987o.f0(AbstractC6980h.u(stringArrayExtra), arrayList));
    }
}
