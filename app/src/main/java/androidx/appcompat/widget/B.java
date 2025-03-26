package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    private TextView f7367a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f7368b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    B(TextView textView) {
        this.f7367a = (TextView) y0.i.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f7368b;
        return textClassifier == null ? a.a(this.f7367a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f7368b = textClassifier;
    }
}
