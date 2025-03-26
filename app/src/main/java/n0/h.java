package N0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    private final TransformationMethod f4056a;

    h(TransformationMethod transformationMethod) {
        this.f4056a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f4056a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4056a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.f.c().e() != 1) ? charSequence : androidx.emoji2.text.f.c().p(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i8, Rect rect) {
        TransformationMethod transformationMethod = this.f4056a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i8, rect);
        }
    }
}
