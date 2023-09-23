package com.example.springbasic.notice.controller;

import com.example.springbasic.notice.dto.response.NoticeResponse;
import com.example.springbasic.notice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

    private final NoticeService noticeService;

    /** 게시판 목록 */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String notice(Model model) {

        List<NoticeResponse> noticeResponse = noticeService.selectNoticeList();
        System.out.println("notice noticeResponse ==> " + noticeResponse);
        model.addAttribute("notices", noticeResponse);

        return "notice/notice";
    }

    /** 게시판 상세 */
    @RequestMapping(value = "/notice-detail/{noticeId}", method = RequestMethod.GET)
    public String noticeDetail(@PathVariable("noticeId") int noticeId, Model model) {

        NoticeResponse noticeResponse = noticeService.selectOneNotice(noticeId);
        System.out.println("noticeDetail noticeResponse ==> " + noticeResponse);
        model.addAttribute("notice", noticeResponse);

        return "notice/noticeDetail";
    }

}
