package w3;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.AbstractC1112k;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f44337a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44338b;

    public n(Context context, String str) {
        Z2.r.l(context);
        this.f44337a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f44338b = a(context);
        } else {
            this.f44338b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC1112k.f13419a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f44337a.getIdentifier(str, "string", this.f44338b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f44337a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
