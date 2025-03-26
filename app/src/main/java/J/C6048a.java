package j;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6048a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    private Locale f37859a;

    public C6048a(Context context) {
        this.f37859a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f37859a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i8, Rect rect) {
    }
}
