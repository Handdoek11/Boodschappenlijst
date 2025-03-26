package Z3;

import D3.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6428a = {R.attr.theme, b.f1400X};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6429b = {b.f1425x};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6428a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i8, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6429b, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i8, int i9) {
        int b8 = b(context, attributeSet, i8, i9);
        boolean z7 = (context instanceof d) && ((d) context).c() == b8;
        if (b8 == 0 || z7) {
            return context;
        }
        d dVar = new d(context, b8);
        int a8 = a(context, attributeSet);
        if (a8 != 0) {
            dVar.getTheme().applyStyle(a8, true);
        }
        return dVar;
    }
}
