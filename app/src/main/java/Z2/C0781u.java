package Z2;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.AbstractC1112k;

/* renamed from: Z2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0781u {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f6418a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6419b;

    public C0781u(Context context) {
        r.l(context);
        Resources resources = context.getResources();
        this.f6418a = resources;
        this.f6419b = resources.getResourcePackageName(AbstractC1112k.f13419a);
    }

    public String a(String str) {
        int identifier = this.f6418a.getIdentifier(str, "string", this.f6419b);
        if (identifier == 0) {
            return null;
        }
        return this.f6418a.getString(identifier);
    }
}
